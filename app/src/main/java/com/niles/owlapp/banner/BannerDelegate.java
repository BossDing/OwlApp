package com.niles.owlapp.banner;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseViewHolder;
import com.niles.owl.delegate.OwlListDelegate;
import com.niles.owl.list.OnSubItemClicked;
import com.niles.owl.list.OwlBaseItemProvider;
import com.niles.owl.list.OwlItemModel;
import com.niles.owl.list.OwlListAdapter;
import com.niles.owlapp.common.ListAdapter;
import com.niles.owlapp.common.TextProvider;

import java.util.Arrays;

/**
 * Created by Negro
 * Date 2018/5/11
 * Email niulinguo@163.com
 */
public class BannerDelegate extends OwlListDelegate implements OnSubItemClicked {
    @NonNull
    @Override
    protected OwlListAdapter createAdapter() {
        return new ListAdapter(null);
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        getAdapter().addData(Arrays.asList(
                OwlItemModel.create(BannerProvider.class).put("images", new String[]{
                        "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=454134008,208143498&fm=200&gp=0.jpg",
                        "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=724060122,211093464&fm=200&gp=0.jpg",
                        "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2482453600,1121050487&fm=27&gp=0.jpg"
                }).put("subListener", this),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6"),
                OwlItemModel.create(TextProvider.class).put("text", "1"),
                OwlItemModel.create(TextProvider.class).put("text", "2"),
                OwlItemModel.create(TextProvider.class).put("text", "3"),
                OwlItemModel.create(TextProvider.class).put("text", "4"),
                OwlItemModel.create(TextProvider.class).put("text", "5"),
                OwlItemModel.create(TextProvider.class).put("text", "6")
        ));
    }

    @Override
    public void onClick(OwlBaseItemProvider itemProvider, BaseViewHolder helper, OwlItemModel data, int position, int subPosition) {
        final Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(data.getStringArray("images")[subPosition]));
        startActivity(intent);
    }
}
