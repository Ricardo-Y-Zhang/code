package src.cn.goodrock.java.exer3;

/**
 * @program: code
 * @description: 子类，圆柱
 * @author: Mr.Yan
 * @create: 2021-05-20 21:33
 **/
public class Cylinder extends Circle{
    private double length;
    
    public Cylinder(){
        length = 1;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getLength(){
        return length;
    }
    
    /**
     * description: 计算圆柱体积
     * @param  
     * @return  double
     * @author: Mr.Yan
     * @date: 2021/5/20
     **/
    public double findVolume(){
        return findArea() * getLength();
    }
}
