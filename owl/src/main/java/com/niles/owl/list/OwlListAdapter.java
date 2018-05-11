package com.niles.owl.list;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.MultipleItemRvAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;

import java.util.List;

/**
 * Created by Negro
 * Date 2018/5/2
 * Email niulinguo@163.com
 */
public abstract class OwlListAdapter extends MultipleItemRvAdapter<OwlItemModel, BaseViewHolder> {
    public OwlListAdapter(@Nullable List<OwlItemModel> data) {
        super(data);
        finishInitialize();
    }

    @Override
    protected final int getViewType(OwlItemModel model) {
        return model.getItemType();
    }

    @Override
    public abstract void registerItemProvider();

    @NonNull
    private BaseItemProvider getBaseItemProvider(int viewType) {
        return mProviderDelegate.getItemProviders().get(viewType);
    }

    @NonNull
    private BaseItemProvider getBaseItemProvider(@NonNull OwlItemModel model) {
        return getBaseItemProvider(model.getItemType());
    }

    public final void notifySubRefresh() {
        final RecyclerView recyclerView = getRecyclerView();
        final List<OwlItemModel> modelList = getData();
        final int size = modelList.size();
        for (int i = 0; i < size; i++) {
            final RecyclerView.ViewHolder viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            if (viewHolder != null) {
                final OwlItemModel itemModel = modelList.get(i);
                final BaseItemProvider itemProvider = getBaseItemProvider(itemModel);
                if (itemProvider instanceof SubRefreshProvider) {
                    ((SubRefreshProvider) itemProvider).onSubRefresh((BaseViewHolder) viewHolder, itemModel, i);
                }
            }
        }
    }
}
