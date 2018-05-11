package com.niles.owlapp.common;

import android.support.annotation.Nullable;

import com.niles.owl.list.OwlItemModel;
import com.niles.owl.list.OwlListAdapter;
import com.niles.owlapp.countdown.CountDownProvider;
import com.niles.owlapp.main.MainProvider;

import java.util.List;

/**
 * Created by Negro
 * Date 2018/5/2
 * Email niulinguo@163.com
 */
public final class ListAdapter extends OwlListAdapter {

    public ListAdapter(@Nullable List<OwlItemModel> data) {
        super(data);
    }

    @Override
    public void registerItemProvider() {
        mProviderDelegate.registerProvider(new CountDownProvider());
        mProviderDelegate.registerProvider(new TextProvider());
        mProviderDelegate.registerProvider(new MainProvider());
    }
}
