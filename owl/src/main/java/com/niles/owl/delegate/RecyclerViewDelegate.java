package com.niles.owl.delegate;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by Negro
 * Date 2018/4/30
 * Email niulinguo@163.com
 */
public abstract class RecyclerViewDelegate extends OwlDelegate {

    protected RecyclerView mRecyclerView;

    @Nullable
    @Override
    protected Object getRootView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRecyclerView = new RecyclerView(getContext());
        mRecyclerView.setLayoutManager(createLayoutManager());
        mRecyclerView.setAdapter(createAdapter());
        return mRecyclerView;
    }

    protected RecyclerView.LayoutManager createLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    protected abstract RecyclerView.Adapter createAdapter();
}
