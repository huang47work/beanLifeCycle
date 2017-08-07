package com.example.demo.singleton;

/**
 * Created by huang_sq on 2017/8/7.
 */
public class TestClazz {


    public static void main(String[] args) {

        StaticInnerClazzSingleton staticInnerClazzSingleton = StaticInnerClazzSingleton.getInstance();
        StaticInnerClazzSingleton staticInnerClazzSingleton1 = StaticInnerClazzSingleton.getInstance();

        System.out.println(staticInnerClazzSingleton == staticInnerClazzSingleton1);
    }
}
