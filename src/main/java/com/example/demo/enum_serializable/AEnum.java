package com.example.demo.enum_serializable;

import java.io.*;

/**
 * Created by huang_sq on 2017/8/7.
 */
public enum AEnum {
    Instance("名字",25);

    private String name;

    private Integer age;

    AEnum(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "AEnum{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        AEnum aEnum = AEnum.Instance;
        System.out.println(aEnum);
        try{
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os =  new ObjectOutputStream(fs);
            os.writeObject(aEnum);

            FileInputStream fileInputStream = new FileInputStream("foo.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            AEnum aEnum1 = (AEnum) objectInputStream.readObject();
            System.out.println(aEnum1);
            os.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
