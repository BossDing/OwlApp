package com.niles.owlapp.countdown;

import com.blankj.utilcode.util.TimeUtils;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.annotation.ItemProviderTag;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.niles.owlapp.R;
import com.niles.owlapp.base.MultipleItemModel;
import com.niles.owlapp.base.SubRefreshProvider;
import com.niles.owlapp.common.ViewType;

/**
 * Created by Negro
 * Date 2018/5/2
 * Email niulinguo@163.com
 */
@ItemProviderTag(
        viewType = ViewType.TYPE_COUNT_DOWN,
        layout = R.layout.item_text
)
public class CountDownProvider extends BaseItemProvider<MultipleItemModel, BaseViewHolder> implements SubRefreshProvider<MultipleItemModel, BaseViewHolder> {
    @Override
    public void convert(BaseViewHolder helper, MultipleItemModel data, int position) {

        helper.setText(R.id.tv_item_text, TimeUtils.millis2String(data.getLong("time")));
    }

    @Override
    public void onClick(BaseViewHolder helper, MultipleItemModel data, int position) {

    }

    @Override
    public boolean onLongClick(BaseViewHolder helper, MultipleItemModel data, int position) {
        return false;
    }

    @Override
    public void onSubRefresh(BaseViewHolder helper, MultipleItemModel data, int position) {
        helper.setText(R.id.tv_item_text, TimeUtils.millis2String(data.getLong("time")));
    }
}
