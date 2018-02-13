package com.example.cartek.dagger2test2.Module;

import com.example.cartek.dagger2test2.Module.CarModules.Engine;
import com.example.cartek.dagger2test2.Module.CarModules.Seat;
import com.example.cartek.dagger2test2.Module.CarModules.Wheel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CarTek on 2018/2/9.
 */
@Module
public class CarModule {
    @Provides
    public Engine provideEngine(){
        return new Engine();
    }
    @Provides
    public Seat provideSeat(Leather leather){
        return new Seat(leather);
    }
    @Provides
    public Wheel provideWheel(){
        return new Wheel();
    }
    @Provides
    public Leather provideLeather() {
        return new Leather();
    }
}
