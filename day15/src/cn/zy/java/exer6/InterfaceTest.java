package cn.zy.java.exer6;

import java.awt.*;

/**
 * @program: code
 * @description: interface测试
 * @author: Mr.Yan
 * @create: 2021-06-05 17:16
 **/
public class InterfaceTest {

    public static void main(String[] args) {

        Plane p1 = new Plane();

        p1.fly();

        p1.stop();

    }
}


interface Flyable{

    //全局常量
    public static final int MAX_SPEED = 1024;

    //public static final可以省略不写
    int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();

    //省略 public abstract
    void stop();

}


interface Attackable{
    public abstract void attack();
}


class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("芜湖起飞");
    }

    @Override
    public void stop() {
        System.out.println("坠机");
    }
}


class Bullet extends Object implements Flyable, Attackable{

    @Override
    public void fly() {
        System.out.println("芜湖起飞");
    }

    @Override
    public void stop() {
        System.out.println("miss");
    }

    @Override
    public void attack() {
        System.out.println("一击");
    }
}

