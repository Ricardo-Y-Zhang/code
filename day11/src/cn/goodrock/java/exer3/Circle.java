package src.cn.goodrock.java.exer3;

/**
 * @program: code
 * @description: 父类，圆
 * @author: Mr.Yan
 * @create: 2021-05-20 21:33
 **/
public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    /**
     * description: 计算圆的面积
     * @param
     * @return  double
     * @author: Mr.Yan
     * @date: 2021/5/20
     **/
    public double findArea(){
        return Math.PI * radius *radius;
    }

}
