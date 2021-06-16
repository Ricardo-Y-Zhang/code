package cn.goodrock.java.override;

/**
 * @program: code
 * @description: 父类
 * @author: Mr.Yan
 * @create: 2021-05-21 10:00
 **/
public class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void walk(int distance){
        System.out.println("行走距离为：" + distance);
    }
}
