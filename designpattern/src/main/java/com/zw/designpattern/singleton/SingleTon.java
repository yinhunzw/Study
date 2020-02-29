package com.zw.designpattern.singleton;

import android.system.StructUtsname;

public class SingleTon {
    private static SingleTon sInstance;

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        if(sInstance == null) {
            synchronized (SingleTon.class) {
                if(sInstance == null) {
                    sInstance = new SingleTon();
                }
            }
        }
        return sInstance;
    }
}
