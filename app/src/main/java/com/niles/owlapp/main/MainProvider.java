package com.niles.owlapp.main;

import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseViewHolder;
import com.niles.owl.list.OnListItemClicked;
import com.niles.owl.list.OwlBaseItemProvider;
import com.niles.owl.list.OwlItemModel;
import com.niles.owlapp.R;

/**
 * Created by Negro
 * Date 2018/5/11
 * Email niulinguo@163.com
 */
public class MainProvider extends OwlBaseItemProvider {
    @Override
    public int layout() {
        return R.layout.item_text;
    }

    @Override
    public void convert(BaseViewHolder helper, OwlItemModel data, int position) {
        helper.setText(R.id.tv_item_text, data.getString("text"));
    }

    @Override
    public void onClick(BaseViewHolder helper, OwlItemModel data, int position) {
        data.get("listener", (OnListItemClicked) (itemProvider, helper1, data1, position1) -> ToastUtils.showShort(position + "被点击"))
                .onClick(this, helper, data, position);
    }
}
