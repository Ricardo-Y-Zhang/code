package cn.goodrock.java.exer1;

/**
 * @program: code
 * @description: 父类
 * @author: Mr.Yan
 * @create: 2021-05-20 15:11
 **/
public class Person {
    private String name;
    private int age;


    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        eat();
        System.out.println("睡觉");
    }


}
