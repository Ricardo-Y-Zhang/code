package src.cn.goodrock.java.exer6;

import java.util.Random;

/**
 * @program: code
 * @description: 子类
 * @author: Mr.Yan
 * @create: 2021-05-27 10:26
 **/
//继承
public class Cylinder extends Circle{
    private double length;

    public Cylinder(){
        super();//super调用父类中对应的构造器
        length = 1.0;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public double findVolume(){
        return length * super.findArea();
    }

    //方法的重写
    public double findArea(){
        //super.findArea()调用父类中被重写的方法
        return  2 * super.findArea() + 2 * Math.PI * super.getRadius() * length;
    }


}
