package com.niles.owlapp.banner;

import android.view.View;
import android.view.ViewGroup;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseViewHolder;
import com.niles.owl.list.OnSubItemClicked;
import com.niles.owl.list.OwlBaseItemProvider;
import com.niles.owl.list.OwlItemModel;
import com.niles.owlapp.R;

import java.util.Arrays;

/**
 * Created by Negro
 * Date 2018/5/11
 * Email niulinguo@163.com
 */
public class BannerProvider extends OwlBaseItemProvider {
    @Override
    public int layout() {
        return R.layout.item_banner;
    }

    @Override
    public void convert(BaseViewHolder helper, OwlItemModel data, int position) {
        if (data.getBoolean("init")) {
            return;
        }
        data.put("init", true);
        final ConvenientBanner<String> convenientBanner = helper.getView(R.id.convenient_banner);
        convenientBanner.setPages(new CBViewHolderCreator() {
            @Override
            public Holder createHolder(View itemView) {
                return new LocalImageHolderView(mContext, itemView);
            }

            @Override
            public int getLayoutId() {
                return R.layout.item_banner_image;
            }
        }, Arrays.asList(data.getStringArray("images")));

        final ViewGroup.LayoutParams layoutParams = convenientBanner.getLayoutParams();
        final int screenWidth = ScreenUtils.getScreenWidth();
        layoutParams.width = screenWidth;
        layoutParams.height = (int) (screenWidth / 3.0);

        convenientBanner.setOnItemClickListener(subPosition -> data.get("subListener", (OnSubItemClicked) (itemProvider, helper1, data1, position1, subPosition1) -> ToastUtils.showShort("轮播图被点击" + subPosition1)).onClick(BannerProvider.this, helper, data, position, subPosition));
    }
}
