package com.example.demo.singleton;

/**
 * Created by huang_sq on 2017/8/7.
 * 规避了普通的饿汉式可能会导致的线程安全问题 但是因为synchronize的存在 性能不好
 */
public class SynchronizeLazyLoadedSingleton {

    private SynchronizeLazyLoadedSingleton(){}

    private static SynchronizeLazyLoadedSingleton INSTANCE = null;

    public synchronized SynchronizeLazyLoadedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SynchronizeLazyLoadedSingleton();
            return INSTANCE;
        }
        return INSTANCE;
    }

}
