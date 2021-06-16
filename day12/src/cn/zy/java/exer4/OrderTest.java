package cn.zy.java.exer4;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-01 10:08
 **/
public class OrderTest {
    public static void main(String[] args) {

        Order order1 = new Order(007, "Jack");

        Order order2 = new Order(007, "Jack");

        System.out.println("order1 = order2 ? " + order1.equals(order2));

        System.out.println(order1.toString());

        System.out.println(order1);
    }
}
