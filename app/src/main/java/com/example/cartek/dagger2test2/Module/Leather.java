package com.example.cartek.dagger2test2.Module;

import android.util.Log;

/**
 * Created by CarTek on 2018/2/9.
 */

public class Leather {
    public Leather(){
        Log.e(Config.TAG, "new Leather()");
    }
    public Leather(String color){
        Log.e(Config.TAG, "new Leather() color:" + color);
    }
}
