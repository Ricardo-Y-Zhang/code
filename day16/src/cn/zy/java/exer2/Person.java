package cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-07 11:04
 **/
public class Person {

    //静态成员内部类
    static class Dog{
        public void info(){
            System.out.println("dog");
        }
    }

    //非静态成员内部类
    class Bird{
        public void info(){
            System.out.println("bird");
        }
    }
}
