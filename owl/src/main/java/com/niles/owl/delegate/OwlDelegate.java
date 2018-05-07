package com.niles.owl.delegate;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.niles.owl.R;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * Created by Negro
 * Date 2018/4/26
 * Email niulinguo@163.com
 */
public abstract class OwlDelegate extends SupportFragment {

    @SuppressWarnings("NullableProblems")
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final Object rootObj = getRootView(inflater, container, savedInstanceState);
        final View rootView;
        if (rootObj == null) {
            rootView = createEmptyRootView();
        } else if (rootObj instanceof Integer) {
            rootView = inflater.inflate((Integer) rootObj, container, false);
        } else if (rootObj instanceof View) {
            rootView = (View) rootObj;
        } else {
            throw new RuntimeException("un support rootView " + rootObj.getClass().getName());
        }

        return rootView;
    }

    @Nullable
    protected abstract Object getRootView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    private View createEmptyRootView() {
        final TextView textView = new TextView(getContext());
        textView.setText(R.string.empty);
        return textView;
    }
}
