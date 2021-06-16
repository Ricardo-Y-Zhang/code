package cn.zy.java.java8;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-06 14:10
 **/
public class SubClassTest {

    public static void main(String[] args) {

        SubClass s = new SubClass();

        //通过接口的实现类的对象后调用接口的默认方法
        s.method2();

        //只能通过接口直接调用静态方法
        CompareA.method1();

        //类优先原则
        s.method3();
    }
}

class SuperClass{
    public void method3(){
        System.out.println("父类superclass: method3");
    }
}

class SubClass extends SuperClass implements CompareA{
    public void myMethod(){

        //调用接口中定义的默认方法
        CompareA.super.method2();
    }
}
