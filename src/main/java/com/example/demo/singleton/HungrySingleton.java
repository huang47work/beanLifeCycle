package com.example.demo.singleton;

/**
 * Created by huang_sq on 2017/8/7.
 * 这是一种普通的饿汉式单例模式 没有线程安全问题 但是有性能问题，还没用就实例化好了
 */
public class HungrySingleton {

    private HungrySingleton() {

    }
    private static HungrySingleton INSTANCE = new HungrySingleton();
    public HungrySingleton getINSTANCE() {

        return INSTANCE;
    }



}
