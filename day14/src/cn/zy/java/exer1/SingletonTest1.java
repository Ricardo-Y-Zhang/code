package cn.zy.java.exer1;

/**
 * @program: code
 * @description: 单例设计模式：采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
 * @author: Mr.Yan
 * @create: 2021-06-03 11:24
 **/
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        //比较地址值，查看是否为同一对象
        System.out.println(bank1 == bank2);
    }

}


//饿汉式
class Bank{
    //1.私有化类的构造器：在Bank外部无法调用构造器
    private Bank(){}

    //2.内部创建类的对象
    //4.要求对象也必须声明为静态的
    private static Bank instance = new Bank();//一开始就造好对象

    //3.提供公共的静态方法，返回类的对象(静态方法只能调用静态属性)
    //调用非静态方法，需要在外部创建类的对象，因此定义为静态方法，静态属性
    public static Bank getInstance(){
        return instance;
    }
}