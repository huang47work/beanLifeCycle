package com.example.demo.singleton;

/**
 * Created by huang_sq on 2017/8/7.
 *在这一版本的单例模式实现代码中，我们使用了Java的静态内部类。这一技术是被JVM明确说明了的，因
 此不存在任何二义性。在这段代码中，因为StaticInnerClazzSingleton没有static的属性，因此并不会被初始化。直
 到调用getInstance()的时候，会首先加载InnerClazz类，这个类有一个static的
 StaticInnerClazzSingleton实例，因此需要调用StaticInnerClazzSingleton的构造方法，然后getInstance()将把这个内部类
 的instance返回给使用者。由于这个instance是static的，因此并不会构造多次。
 */
public class StaticInnerClazzSingleton {

    private StaticInnerClazzSingleton(){}


    private static class InnerClazz{
        private static StaticInnerClazzSingleton INSTANCE = new StaticInnerClazzSingleton();
    }

    public static StaticInnerClazzSingleton getInstance() {
        return InnerClazz.INSTANCE;
    }


}
