package cn.zy.java.exer1;

/**
 * @program: code
 * @description: 单例模式，懒汉式
 * @author: Mr.Yan
 * @create: 2021-06-03 13:28
 **/
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);
    }
}


class Order{
    //1.私有化类的构造器
    private Order(){}

    //2.声明当前类对象，没有初始化
    //4.此对象必须声明为static
    private static Order instance = null;//什么时候用什么时候造

    //3.声明public、static的返回当前类对象的方法
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}

