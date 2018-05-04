package com.niles.owlapp.base;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.MultipleItemRvAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;

import java.util.List;

/**
 * Created by Negro
 * Date 2018/5/2
 * Email niulinguo@163.com
 */
public class ListAdapter extends MultipleItemRvAdapter<MultipleItemModel, BaseViewHolder> {
    public ListAdapter(@Nullable List<MultipleItemModel> data) {
        super(data);
        finishInitialize();
    }

    @Override
    protected int getViewType(MultipleItemModel model) {
        return model.getViewType();
    }

    @Override
    public void registerItemProvider() {
        mProviderDelegate.registerProvider(new CountDownProvider());
        mProviderDelegate.registerProvider(new TextProvider());
    }

    private BaseItemProvider getBaseItemProvider(int viewType) {
        return mProviderDelegate.getItemProviders().get(viewType);
    }

    public BaseItemProvider getBaseItemProvider(MultipleItemModel model) {
        return getBaseItemProvider(model.getViewType());
    }
}
