package src.cn.zy.java.exer1;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-07 10:35
 **/
public class Test {
    public static void main(String[] args) {

        //继承抽象类的匿名类
        Person16 p1 = new Person16() {
            @Override
            public void eat() {
                System.out.println("eat");
            }
        };

        p1.eat();
    }
}

abstract class Person16{
    public abstract void  eat();
}
