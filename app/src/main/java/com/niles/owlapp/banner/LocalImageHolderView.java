package com.niles.owlapp.banner;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by Negro
 * Date 2018/5/14
 * Email niulinguo@163.com
 */
public class LocalImageHolderView extends Holder<String> {

    private final Context mContext;
    private final ImageView mImageView;

    LocalImageHolderView(Context context, View view) {
        super(view);
        mContext = context;
        mImageView = (ImageView) view;
    }

    @Override
    protected void initView(View itemView) {
    }

    @Override
    public void updateUI(String data) {
        Glide.with(mContext)
                .load(data)
                .apply(RequestOptions.centerCropTransform())
                .into(mImageView);
    }
}
