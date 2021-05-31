package src.cn.goodrock.java.exer6;

/**
 * @program: code
 * @description: 父类
 * @author: Mr.Yan
 * @create: 2021-05-27 10:26
 **/
public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }


    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
