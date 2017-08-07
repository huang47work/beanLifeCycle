package com.example.demo.singleton;

/**
 * Created by huang_sq on 2017/8/7.
 * 懒汉式的单例 但是这里有线程安全问题
 * 线程2 在线程1判断了为null 但是又没有实例化单例的时候 线程2也判断为null 则出现了两份改对象 单例失败
 */
public class LazyLoadedSingleton {

    private LazyLoadedSingleton() {}

    private static LazyLoadedSingleton lazyLoadedSingleton = null;

    public static LazyLoadedSingleton getInstance() {
        if (lazyLoadedSingleton == null) {
            lazyLoadedSingleton = new LazyLoadedSingleton();
            return lazyLoadedSingleton;
        }
        return lazyLoadedSingleton;
    }

}
