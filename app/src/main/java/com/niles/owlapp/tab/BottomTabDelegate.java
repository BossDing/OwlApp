package com.niles.owlapp.tab;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.niles.owl.delegate.OwlDelegate;
import com.niles.owlapp.R;
import com.niles.owlapp.databinding.DelegateBottomTabLayoutBinding;

import java.util.ArrayList;

import devlight.io.library.ntb.NavigationTabBar;

/**
 * Created by Negro
 * Date 2018/5/4
 * Email niulinguo@163.com
 */
public class BottomTabDelegate extends OwlDelegate {

    private DelegateBottomTabLayoutBinding mLayoutBinding;

    @Nullable
    @Override
    protected Object getRootView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.delegate_bottom_tab_layout;
    }

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = super.onCreateView(inflater, container, savedInstanceState);
        mLayoutBinding = DataBindingUtil.bind(view);
        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        final NavigationTabBar navigationTabBar = mLayoutBinding.navigationTabBar;
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(new NavigationTabBar.Model.Builder(getResources().getDrawable(R.drawable.ic_launcher_background), Color.BLUE)
                .selectedIcon(getResources().getDrawable(R.drawable.ic_launcher_foreground))
                .title("首页")
                .build()
        );
        models.add(new NavigationTabBar.Model.Builder(getResources().getDrawable(R.drawable.ic_launcher_background), Color.BLUE)
                .selectedIcon(getResources().getDrawable(R.drawable.ic_launcher_foreground))
                .title("分类")
                .build()
        );
        models.add(new NavigationTabBar.Model.Builder(getResources().getDrawable(R.drawable.ic_launcher_background), Color.BLUE)
                .selectedIcon(getResources().getDrawable(R.drawable.ic_launcher_foreground))
                .title("购物车")
                .badgeTitle("99")
                .build()
        );
        models.add(new NavigationTabBar.Model.Builder(getResources().getDrawable(R.drawable.ic_launcher_background), Color.BLUE)
                .selectedIcon(getResources().getDrawable(R.drawable.ic_launcher_foreground))
                .title("我的")
                .build()
        );
        navigationTabBar.setModels(models);
        navigationTabBar.setIsBadged(true);
        navigationTabBar.setBadgeTitleColor(Color.RED);
        navigationTabBar.setBadgeGravity(NavigationTabBar.BadgeGravity.TOP);
        navigationTabBar.setBadgePosition(NavigationTabBar.BadgePosition.RIGHT);
        navigationTabBar.setBadgeSize(NavigationTabBar.AUTO_SIZE);
        navigationTabBar.setBadgeBgColor(Color.GREEN);
        navigationTabBar.setBgColor(Color.WHITE);
        navigationTabBar.setIconSizeFraction(0.5f);
        navigationTabBar.setIsTitled(true);
        navigationTabBar.setTitleMode(NavigationTabBar.TitleMode.ALL);
        navigationTabBar.setTitleSize(NavigationTabBar.AUTO_SIZE);
        navigationTabBar.setIsSwiped(true);
        navigationTabBar.setIsScaled(true);
        navigationTabBar.setIsTinted(true);
        navigationTabBar.setModelIndex(0);
        navigationTabBar.setAnimationDuration(0);

        models.get(2).showBadge();

        navigationTabBar.setOnTabBarSelectedIndexListener(new NavigationTabBar.OnTabBarSelectedIndexListener() {
            @Override
            public void onStartTabSelected(NavigationTabBar.Model model, int index) {

            }

            @Override
            public void onEndTabSelected(NavigationTabBar.Model model, int index) {
                Toast.makeText(_mActivity, model.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mLayoutBinding.unbind();
    }
}
