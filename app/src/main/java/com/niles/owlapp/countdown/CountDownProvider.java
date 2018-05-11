package com.niles.owlapp.countdown;

import android.support.annotation.NonNull;

import com.blankj.utilcode.util.TimeUtils;
import com.chad.library.adapter.base.BaseViewHolder;
import com.niles.owl.list.OwlBaseItemProvider;
import com.niles.owl.list.OwlItemModel;
import com.niles.owl.list.SubRefreshProvider;
import com.niles.owlapp.R;

/**
 * Created by Negro
 * Date 2018/5/2
 * Email niulinguo@163.com
 */
public class CountDownProvider extends OwlBaseItemProvider implements SubRefreshProvider {

    @Override
    public int layout() {
        return R.layout.item_text;
    }

    @Override
    public void convert(BaseViewHolder helper, OwlItemModel data, int position) {
        helper.setText(R.id.tv_item_text, TimeUtils.millis2String(data.getLong("time")));
    }

    @Override
    public void onSubRefresh(@NonNull BaseViewHolder helper, @NonNull OwlItemModel data, int position) {
        helper.setText(R.id.tv_item_text, TimeUtils.millis2String(data.getLong("time")));
    }
}
