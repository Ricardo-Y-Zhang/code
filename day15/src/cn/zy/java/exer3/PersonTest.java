package cn.zy.java.exer3;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-04 15:44
 **/
public class PersonTest {
    public static void main(String[] args) {


        //创建一匿名子类的对象
        Person p = new Person() {
            @Override
            public void work() {
                System.out.println("not work");
            }

            @Override
            public void breath() {
                System.out.println("breath");
            }
        };


        //多态，编译时为父类方法，运行时为匿名子类中重写的方法
       method(p);

       //匿名子类的匿名对象
       method(new Person() {
           @Override
           public void work() {

           }

           @Override
           public void breath() {

           }
       });
    }

    public static void method(Person person){
        person.work();
        person.breath();
    }
}

abstract class Person{
    private String name;
    private int id;

    public abstract void work();

    public abstract void breath();
}

class Student extends Person{
    @Override
    public void work() {
        System.out.println("study");
    }

    @Override
    public void breath() {
        System.out.println("I cannot breath");
    }
}

