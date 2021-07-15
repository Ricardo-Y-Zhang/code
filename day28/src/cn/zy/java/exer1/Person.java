package cn.zy.java.exer1;

import java.io.Serializable;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-14 14:03
 **/
public class Person implements Serializable {
    private static final long serialVersionUID = -634594470754667710L;
    private String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show() throws NullPointerException, RuntimeException{
        System.out.println("我是个人");
    }

    private void shows(String str){
        System.out.println(str + "是人吗");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
