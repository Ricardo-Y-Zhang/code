package src.com.goodrock.java;

public class OverloadExer {
    public void mOL(int x){
        System.out.println(x * x);
    }

    public void mOL(int x, int y){
        System.out.println(x * y);
    }
    public void mOL(String str){
        System.out.println(str);
    }
    public int getMax(int x, int y){
        return (x > y) ? x : y;
    }
    public double getMax(double x, double y){
        return (x > y) ? x : y;
    }
    public double getMax(double x, double y, double z){
        double max = (x > y) ? x : y;
        max = (max > z) ? max : z;
        return max;
    }
    public static void main(String[] args) {
        int x = 3, y =4;
        String str = new String("hello world!");
        OverloadExer test = new OverloadExer();
        test.mOL(x);
        test.mOL(x, y);
        test.mOL(str);
        System.out.println("max : " + test.getMax(x, y));
        double d1 = 1.0, d2 = 1.1 , d3 = 0.9;
        System.out.println("max : " + test.getMax(d1, d2));
        System.out.println("max : " + test.getMax(d1, d2, d3));
    }
}
