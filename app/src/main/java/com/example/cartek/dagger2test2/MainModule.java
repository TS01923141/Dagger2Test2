package com.example.cartek.dagger2test2;

import com.example.cartek.dagger2test2.Module.Car;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CarTek on 2018/2/12.
 */
@Singleton
@Module
public class MainModule {
    private Car car;
    public MainModule(){
        car = new Car();
    }

    @Provides
    public Car provideCar(){
        return car;
    }
}
