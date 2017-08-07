package com.example.demo.singleton;

/**
 * Created by huang_sq on 2017/8/7.
 * 规避了普通的饿汉式可能会导致的线程安全问题 但是因为synchronize的存在 性能不好
 */
public class SynchronizeLazyLoadedSingleton_2 {

    private SynchronizeLazyLoadedSingleton_2(){}

    private static SynchronizeLazyLoadedSingleton_2 INSTANCE = null;

    public SynchronizeLazyLoadedSingleton_2 getInstance() {
        if (INSTANCE == null) {
            synchronized (SynchronizeLazyLoadedSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SynchronizeLazyLoadedSingleton_2();
                    return INSTANCE;
                }
            }
        }
        return INSTANCE;
    }

}
