package com.example.cartek.dagger2test2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by CarTek on 2018/2/12.
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
