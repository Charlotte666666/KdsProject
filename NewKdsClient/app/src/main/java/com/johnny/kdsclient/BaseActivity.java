package com.johnny.kdsclient;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.anzewei.parallaxbacklayout.ParallaxActivityBase;

import butterknife.ButterKnife;

/**
 * Created by Johnny on 2016/10/3.
 */

public abstract class BaseActivity extends ParallaxActivityBase {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configTheme();
        setContentView(layout());
        ButterKnife.bind(this);
        initDate();
        initView();
    }

    /**
     * configTheme()
     */
    protected void configTheme() {
        
    }

    /**
     * setContentView()
     *
     * @return
     */
    protected abstract int layout();

    /**
     * after setContextView() and before initView in onCreate()
     */
    protected abstract void initDate();

    /**
     * after initDate() in onCreate()
     */
    protected abstract void initView();
}
