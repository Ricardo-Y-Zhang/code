package cn.zy.java.exer3;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-05-31 16:03
 **/
public class MyRectangle extends GeometricObject{
    private double width;

    private double height;

    public MyRectangle(double width, double height, String color, double weight){
        super(color, weight);

        this.width = width;

        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return width * height;
    }
}
