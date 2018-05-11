package com.niles.owlapp.countdown;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.niles.owl.delegate.OwlListDelegate;
import com.niles.owl.list.OwlItemModel;
import com.niles.owl.list.OwlListAdapter;
import com.niles.owlapp.common.ListAdapter;
import com.niles.owlapp.common.TextProvider;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Negro
 * Date 2018/5/2
 * Email niulinguo@163.com
 */
public class CountDownListDelegate extends OwlListDelegate {

    private final CountDownTimer mCountDownTimer = new CountDownTimer(System.currentTimeMillis(), 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            final List<OwlItemModel> data = getDataList();
            for (int i = 0; i < data.size(); i++) {
                final OwlItemModel model = data.get(i);
                if (model.getProviderClass() == CountDownProvider.class) {
                    // 更新 Model
                    model.put("time", model.getLong("time") - 1000);
                }
            }
            getAdapter().notifySubRefresh();
        }

        @Override
        public void onFinish() {

        }
    };

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mCountDownTimer.cancel();
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        getAdapter().addData(Arrays.asList(
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis()),
                OwlItemModel.create(TextProvider.class),
                OwlItemModel.create(CountDownProvider.class).put("time", System.currentTimeMillis())
        ));
        mCountDownTimer.start();
    }

    @NonNull
    @Override
    protected OwlListAdapter createAdapter() {
        return new ListAdapter(null);
    }
}
