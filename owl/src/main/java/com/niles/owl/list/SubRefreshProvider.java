package com.niles.owl.list;

import android.support.annotation.NonNull;

import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by Negro
 * Date 2018/5/4
 * Email niulinguo@163.com
 */
public interface SubRefreshProvider {

    void onSubRefresh(@NonNull BaseViewHolder helper, @NonNull OwlItemModel data, int position);

}
