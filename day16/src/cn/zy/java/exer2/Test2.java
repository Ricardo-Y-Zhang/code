package src.cn.zy.java.exer2;

import java.text.Bidi;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-07 11:05
 **/
public class Test2 {
    public static void main(String[] args) {

        Person.Dog dog = new Person.Dog();

        dog.info();

        Person p = new Person();

        Person.Bird bird = p.new Bird();

        bird.info();
    }
}
