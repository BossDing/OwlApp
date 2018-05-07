package com.niles.owlapp.scan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.niles.owl.delegate.OwlDelegate;

import me.dm7.barcodescanner.zbar.Result;
import me.dm7.barcodescanner.zbar.ZBarScannerView;
import timber.log.Timber;

/**
 * Created by Negro
 * Date 2018/5/7
 * Email niulinguo@163.com
 */
public class ScanDelegate extends OwlDelegate implements ZBarScannerView.ResultHandler {

    private ZBarScannerView mScannerView;

    @Nullable
    @Override
    protected Object getRootView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mScannerView = new ZBarScannerView(getContext());
        return mScannerView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }

    @Override
    public void handleResult(Result result) {
        Timber.tag(TAG).i(result.getContents());
        Timber.tag(TAG).i(result.getBarcodeFormat().getName());
        mScannerView.resumeCameraPreview(this);
    }

}
