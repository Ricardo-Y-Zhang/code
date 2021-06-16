package cn.goodrock.java.exer6;

/**
 * @program: code
 * @description: 测试类
 * @author: Mr.Yan
 * @create: 2021-05-27 10:50
 **/
public class CylinderTest {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();

        System.out.println("radius: " + cylinder.getRadius() + "\nlength: " + cylinder.getLength());

        System.out.println("Area: " + cylinder.findArea());

        cylinder.setRadius(2);

        System.out.println("radius: " + cylinder.getRadius() + "\nlength: " + cylinder.getLength());

        System.out.println("Area: " + cylinder.findArea());

        cylinder.setLength(2.0);

        System.out.println("radius: " + cylinder.getRadius() + "\nlength: " + cylinder.getLength());

        System.out.println("Area: " + cylinder.findArea());


        System.out.println("Circle: ");

        Circle circle = new Circle(9.9);

        System.out.println("radius: " + circle.getRadius());

        System.out.println("Area: " + circle.findArea());
    }
}
