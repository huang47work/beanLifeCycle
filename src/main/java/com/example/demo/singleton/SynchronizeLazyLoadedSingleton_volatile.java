package com.example.demo.singleton;

/**
 * Created by huang_sq on 2017/8/7.
 * 规避了普通的饿汉式可能会导致的线程安全问题 但是因为synchronize的存在 性能不好
 */
public class SynchronizeLazyLoadedSingleton_volatile {

    private SynchronizeLazyLoadedSingleton_volatile(){}

    private volatile static SynchronizeLazyLoadedSingleton_volatile INSTANCE = null;

    public SynchronizeLazyLoadedSingleton_volatile getInstance() {
        if (INSTANCE == null) {
            synchronized (SynchronizeLazyLoadedSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SynchronizeLazyLoadedSingleton_volatile();
                    return INSTANCE;
                }
            }
        }
        return INSTANCE;
    }

}
