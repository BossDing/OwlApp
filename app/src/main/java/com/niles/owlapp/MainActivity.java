package com.niles.owlapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.jaeger.library.StatusBarUtil;
import com.niles.owl.activity.OwlActivity;
import com.niles.owl.delegate.OwlDelegate;
import com.niles.owlapp.main.MainDelegate;

public class MainActivity extends OwlActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setColor(this, Color.BLACK);
    }

    @NonNull
    @Override
    protected OwlDelegate getRootDelegate() {
        return new MainDelegate();
    }
}
