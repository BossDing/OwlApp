package com.niles.owl.list;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.provider.BaseItemProvider;

/**
 * Created by Negro
 * Date 2018/5/11
 * Email niulinguo@163.com
 */
public abstract class OwlBaseItemProvider extends BaseItemProvider<OwlItemModel, BaseViewHolder> {
    @Override
    public final int viewType() {
        return ViewTypeCreator.getId(getClass());
    }
}
