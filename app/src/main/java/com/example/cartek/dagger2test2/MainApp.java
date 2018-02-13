package com.example.cartek.dagger2test2;

import android.app.Application;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by CarTek on 2018/2/12.
 */

public class MainApp extends Application {
    private MainComponent mainComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mainComponent = DaggerMainComponent.builder()
                .mainModule(new MainModule())
                .build();
    }

    public MainComponent getMainComponent(){
        return mainComponent;
    }
}
