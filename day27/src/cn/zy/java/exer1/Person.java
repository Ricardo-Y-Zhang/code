package cn.zy.java.exer1;

import java.io.Serializable;

/**
 * @program: code
 * @description: 自定义类实现serializable接口，方可序列化
 * @author: Mr.Yan
 * @create: 2021-07-12 10:30
 **/
public class Person implements Serializable {

    //提供全局常量：serialVersionUID
    public static final long serialVersionUID = 127370754667710L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
