package src.cn.zy.java.exer3;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-05-31 16:00
 **/
public class Circle extends GeometricObject{

    private double radius;

    public Circle(double radius, String color, double weight){
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
