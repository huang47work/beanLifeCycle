package com.example.demo;

import com.example.demo.test.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huang_sq on 2017/8/4.
 */
@SpringBootApplication
public class TestCase {

    public static void main(String[] args) {
        System.out.println("现在开始初始化容器");

        ApplicationContext context = SpringApplication.run(TestCase.class);
        System.out.println("容器初始化成功");
        //得到Preson，并使用
        System.out.println("现在开始获取person引用");
        Person person = context.getBean("person",Person.class);
        System.out.println("获取成功----person:" + person);
        System.out.println("现在开始关闭容器！");
        ((AnnotationConfigApplicationContext) context).registerShutdownHook();
        System.out.println("------------------------------------------end------------------------------------------------");

    }


}
