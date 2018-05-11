package com.niles.owlapp.scan;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.blankj.utilcode.util.ToastUtils;
import com.niles.owl.delegate.OwlDelegate;

import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnNeverAskAgain;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;

/**
 * Created by Negro
 * Date 2018/5/7
 * Email niulinguo@163.com
 */
@RuntimePermissions
public class ScanPermissionDelegate extends OwlDelegate {

    private boolean mHasPermission = true;

    @Nullable
    @Override
    protected Object createRootView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final TextView textView = new TextView(getContext());
        textView.setText("请授权");
        textView.setOnClickListener(view -> ScanPermissionDelegatePermissionsDispatcher.showScanDelegateWithPermissionCheck(ScanPermissionDelegate.this));
        return textView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScanPermissionDelegatePermissionsDispatcher.showScanDelegateWithPermissionCheck(this);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onHasPermission(mHasPermission);
    }

    @NeedsPermission(Manifest.permission.CAMERA)
    void showScanDelegate() {
        onHasPermission(true);
        startWithPop(new ScanDelegate());
    }

    @OnShowRationale(Manifest.permission.CAMERA)
    void showRationaleForCamera(final PermissionRequest request) {
        new AlertDialog.Builder(_mActivity)
                .setMessage("需要获取相机权限")
                .setPositiveButton("允许", (dialog, button) -> request.proceed())
                .setNegativeButton("拒绝", (dialog, button) -> request.cancel())
                .show();
    }

    @OnPermissionDenied(Manifest.permission.CAMERA)
    void showDeniedForCamera() {
        ToastUtils.showShort("相机不可用");
        onHasPermission(false);
    }

    @OnNeverAskAgain(Manifest.permission.CAMERA)
    void showNeverAskForCamera() {
        ToastUtils.showShort("相机被禁用");
        onHasPermission(false);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        ScanPermissionDelegatePermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    }

    private void onHasPermission(boolean has) {
        mHasPermission = has;
        final View rootView = getRootView();
        if (rootView != null) {
            rootView.setVisibility(has ? View.GONE : View.VISIBLE);
        }
    }
}
