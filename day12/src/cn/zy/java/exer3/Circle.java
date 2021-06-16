package cn.zy.java.exer3;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
