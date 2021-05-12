package src.cn.zy.exer2;

public class TriAngle {
    private double base;
    private double height;

    public TriAngle(double b, double h){
        base = b;
        height = h;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public double Area(){
        return base * height / 2;
    }
}
