package com.niles.owl.delegate;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseViewHolder;
import com.niles.owl.list.OwlItemModel;
import com.niles.owl.list.OwlListAdapter;

import java.util.List;

/**
 * Created by Negro
 * Date 2018/4/30
 * Email niulinguo@163.com
 */
public abstract class OwlListDelegate extends OwlDelegate {

    protected RecyclerView mRecyclerView;

    @Nullable
    @Override
    protected final Object createRootView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRecyclerView = new RecyclerView(getContext());
        mRecyclerView.setLayoutManager(createLayoutManager());
        createAdapter().bindToRecyclerView(mRecyclerView);
        return mRecyclerView;
    }

    @NonNull
    protected RecyclerView.LayoutManager createLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    @NonNull
    protected abstract OwlListAdapter createAdapter();

    @NonNull
    protected final OwlListAdapter getAdapter() {
        return (OwlListAdapter) mRecyclerView.getAdapter();
    }

    @NonNull
    protected final List<OwlItemModel> getDataList() {
        return getAdapter().getData();
    }

    @Nullable
    protected final BaseViewHolder getViewHolder(int position) {
        return (BaseViewHolder) mRecyclerView.findViewHolderForAdapterPosition(position);
    }
}
