package com.niles.owlapp.base;

import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by Negro
 * Date 2018/5/4
 * Email niulinguo@163.com
 */
public interface SubRefreshProvider<T, V extends BaseViewHolder> {

    void onSubRefresh(V helper, T data, int position);

}
