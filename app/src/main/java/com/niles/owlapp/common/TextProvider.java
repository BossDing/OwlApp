package com.niles.owlapp.common;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.annotation.ItemProviderTag;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.niles.owlapp.R;
import com.niles.owlapp.base.MultipleItemModel;

/**
 * Created by Negro
 * Date 2018/5/2
 * Email niulinguo@163.com
 */
@ItemProviderTag(
        viewType = ViewType.TYPE_TEXT,
        layout = R.layout.item_text
)
public class TextProvider extends BaseItemProvider<MultipleItemModel, BaseViewHolder> {
    @Override
    public void convert(BaseViewHolder helper, MultipleItemModel data, int position) {
    }

    @Override
    public void onClick(BaseViewHolder helper, MultipleItemModel data, int position) {

    }

    @Override
    public boolean onLongClick(BaseViewHolder helper, MultipleItemModel data, int position) {
        return false;
    }
}
