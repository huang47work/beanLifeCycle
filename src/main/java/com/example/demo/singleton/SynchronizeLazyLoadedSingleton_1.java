package com.example.demo.singleton;

/**
 * Created by huang_sq on 2017/8/7.
 * 规避了普通的饿汉式可能会导致的线程安全问题 但是因为synchronize的存在 性能不好
 */
public class SynchronizeLazyLoadedSingleton_1 {

    private SynchronizeLazyLoadedSingleton_1(){}

    private static SynchronizeLazyLoadedSingleton_1 INSTANCE = null;

    public SynchronizeLazyLoadedSingleton_1 getInstance() {
        synchronized (SynchronizeLazyLoadedSingleton.class){
            if (INSTANCE == null) {
                INSTANCE = new SynchronizeLazyLoadedSingleton_1();
                return INSTANCE;
            }
        }
        return INSTANCE;
    }

}
