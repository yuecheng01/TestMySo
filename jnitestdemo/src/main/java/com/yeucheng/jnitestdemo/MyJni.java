package com.yeucheng.jnitestdemo;

/**
 * Created by Administrator on 2018/3/17.
 */

public class MyJni {
    static {
        System.loadLibrary("MyJni");
    }

    public native static String getString();
}
