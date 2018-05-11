package com.niles.owlapp.common;

import com.chad.library.adapter.base.BaseViewHolder;
import com.niles.owl.list.OwlBaseItemProvider;
import com.niles.owl.list.OwlItemModel;
import com.niles.owlapp.R;

/**
 * Created by Negro
 * Date 2018/5/2
 * Email niulinguo@163.com
 */
public class TextProvider extends OwlBaseItemProvider {
    @Override
    public int layout() {
        return R.layout.item_text;
    }

    @Override
    public void convert(BaseViewHolder helper, OwlItemModel data, int position) {
    }
}
