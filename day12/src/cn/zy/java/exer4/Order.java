package src.cn.zy.java.exer4;

import java.util.Objects;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-01 10:03
 **/
public class Order {
    private int orderId;
    private String orderName;


    public Order(int orderId, String orderName){
        this.orderId = orderId;

        this.orderName = orderName;
    }


    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    public int getOrderId(){
        return orderId;
    }

    public void setOrderName(String orderName){
        this.orderName = orderName;
    }

    public String getOrderName(){
        return orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
