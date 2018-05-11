package com.niles.owl.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;

import com.niles.owl.R;
import com.niles.owl.delegate.OwlDelegate;

import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by Negro
 * Date 2018/4/26
 * Email niulinguo@163.com
 */
public abstract class OwlActivity extends SupportActivity {

    private static final int ID_CONTENT_VIEW = R.id.owl_activity_content_view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(createContentView());
        loadRootFragment(ID_CONTENT_VIEW, getRootDelegate());
    }

    @NonNull
    protected abstract OwlDelegate getRootDelegate();

    private View createContentView() {
        final FrameLayout contentView = new FrameLayout(this);
        contentView.setId(ID_CONTENT_VIEW);
        contentView.setBackgroundColor(Color.WHITE);
        return contentView;
    }
}
