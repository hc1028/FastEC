package com.hchao.fastec;

import android.app.Application;

import com.hchao.latte_core.app.Latte;

/**
 * Created by HC on 2018/01/23.
 */
public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("")
                .configure();
    }
}
