package com.niles.owlapp.countdown;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.niles.owl.delegate.RecyclerViewDelegate;
import com.niles.owlapp.base.MultipleItemModel;
import com.niles.owlapp.common.ListAdapter;
import com.niles.owlapp.common.ViewType;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Negro
 * Date 2018/5/2
 * Email niulinguo@163.com
 */
public class ListDelegate extends RecyclerViewDelegate {

    private ListAdapter mListAdapter;
    private final CountDownTimer mCountDownTimer = new CountDownTimer(System.currentTimeMillis(), 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            final List<MultipleItemModel> data = mListAdapter.getData();
            for (int i = 0; i < data.size(); i++) {
                final MultipleItemModel model = data.get(i);
                if (model.getItemType() == ViewType.TYPE_COUNT_DOWN) {
                    final BaseItemProvider baseItemProvider = mListAdapter.getBaseItemProvider(model);
                    final BaseViewHolder baseViewHolder = (BaseViewHolder) mRecyclerView.findViewHolderForAdapterPosition(i);
                    // 更新 Model
                    model.put("time", model.getLong("time") - 1000);
                    if (baseViewHolder != null) {
                        // 局部刷新
                        ((CountDownProvider) baseItemProvider).onSubRefresh(baseViewHolder, model, i);
                    }
                }
            }
        }

        @Override
        public void onFinish() {

        }
    };

    @Override
    protected RecyclerView.Adapter createAdapter() {
        mListAdapter = new ListAdapter(null);
        return mListAdapter;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mCountDownTimer.cancel();
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        mListAdapter.addData(Arrays.asList(
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis()),
                new MultipleItemModel(ViewType.TYPE_TEXT),
                new MultipleItemModel(ViewType.TYPE_COUNT_DOWN).put("time", System.currentTimeMillis())
        ));
        mCountDownTimer.start();
    }
}
