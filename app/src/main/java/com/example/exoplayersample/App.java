package com.example.exoplayersample;

import android.app.Application;

/**
 * Created by 龙泉 on 2016/12/26.
 */

public class App extends Application {

    public static App mInstance;

    public App() {
        mInstance = this;
    }

    public static App getInstance() {
        return mInstance;
    }
}
