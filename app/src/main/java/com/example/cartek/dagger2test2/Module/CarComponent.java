package com.example.cartek.dagger2test2.Module;

import dagger.Component;

/**
 * Created by CarTek on 2018/2/9.
 */
@Component(modules = CarModule.class)
public interface CarComponent {
    void inject(Car car);
}
