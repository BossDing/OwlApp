package com.niles.owl.list;

import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by Negro
 * Date 2018/5/11
 * Email niulinguo@163.com
 */
public interface OnListItemClicked {

    void onClick(OwlBaseItemProvider itemProvider, BaseViewHolder helper, OwlItemModel data, int position);

}
