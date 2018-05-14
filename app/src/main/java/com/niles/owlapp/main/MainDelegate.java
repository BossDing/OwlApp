package com.niles.owlapp.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseViewHolder;
import com.niles.owl.delegate.OwlListDelegate;
import com.niles.owl.list.OnListItemClicked;
import com.niles.owl.list.OwlBaseItemProvider;
import com.niles.owl.list.OwlItemModel;
import com.niles.owl.list.OwlListAdapter;
import com.niles.owlapp.banner.BannerDelegate;
import com.niles.owlapp.common.ListAdapter;
import com.niles.owlapp.countdown.CountDownListDelegate;
import com.niles.owlapp.scan.ScanPermissionDelegate;
import com.niles.owlapp.tab.BottomTabDelegate;

import java.util.Arrays;

/**
 * Created by Negro
 * Date 2018/4/27
 * Email niulinguo@163.com
 */
public class MainDelegate extends OwlListDelegate implements OnListItemClicked {
    @NonNull
    @Override
    protected OwlListAdapter createAdapter() {
        return new ListAdapter(null);
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        getAdapter().addData(Arrays.asList(
                OwlItemModel.create(MainProvider.class).put("text", "倒计时").put("listener", this),
                OwlItemModel.create(MainProvider.class).put("text", "底部菜单").put("listener", this),
                OwlItemModel.create(MainProvider.class).put("text", "扫一扫").put("listener", this),
                OwlItemModel.create(MainProvider.class).put("text", "轮播图").put("listener", this)
        ));
    }

    @Override
    public void onClick(OwlBaseItemProvider itemProvider, BaseViewHolder helper, OwlItemModel data, int position) {
        switch (data.getString("text")) {
            case "倒计时": {
                start(new CountDownListDelegate());
                break;
            }
            case "底部菜单": {
                start(new BottomTabDelegate());
                break;
            }
            case "扫一扫": {
                start(new ScanPermissionDelegate());
                break;
            }
            case "轮播图": {
                start(new BannerDelegate());
                break;
            }
        }
    }
}
