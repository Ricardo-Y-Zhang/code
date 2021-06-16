package cn.zy.java.exer1;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-04 11:24
 **/
public class PersonTest {
    public static void main(String[] args) {
        Man m1 = new Man("Jack", 18, 30000);

        m1.eat();
    }
}

//抽象类
abstract class Person{
    String name;
    int age;
    static String dec;

    public Person(){}

    public Person(String name, int age){
        this.name =  name;
        this.age = age;
    }

    static {
        dec = "sorry, i am police";
    }

    //抽象方法
    public abstract void eat();

}

class Man extends Person{
    int salary;

    public Man(String name, int age, int salary){
        super(name, age);
        this.salary = salary;
    }

    //重写抽象方法
    @Override
    public void eat(){
        System.out.println("man eat");
    }
}
