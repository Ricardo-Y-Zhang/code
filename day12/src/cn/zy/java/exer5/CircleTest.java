package cn.zy.java.exer5;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-01 11:30
 **/
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0, "white" , 2.0);

        Circle circle2 = new Circle(1.0, "black", 3.0);

        System.out.println("circle1 = circle2 ? " + circle1.equals(circle2));

        System.out.println(circle1.toString());

        System.out.println("color是否相等： "  + circle1.getColor().equals(circle2.getColor()));
    }
}
