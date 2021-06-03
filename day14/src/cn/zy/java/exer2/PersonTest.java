package src.cn.zy.java.exer2;

import src.cn.zy.java.exer1.Person;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-03 15:18
 **/
public class PersonTest {
    public static void main(String[] args) {
        System.out.println("类的加载：");

        String str = Person2.getDesc();

        System.out.println("对象的加载：");

        Person2 p1 = new Person2("jack",18);

        Person2 p2 = new Person2("Juce", 19);

    }
}
