package cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-06 11:00
 **/
public class Order<T> {

    String orderName;
    int orderId;

    //l类的内部结构可以使用泛型
    T orderT;

    public Order(){}

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }



}


//继承时指明泛型类型
class SubOrder1 extends Order<Integer>{}

//继承时不指明泛型类型
class SubOrder2<T> extends Order<T>{}