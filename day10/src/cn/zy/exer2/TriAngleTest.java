package src.cn.zy.exer2;

public class TriAngleTest {
    public static void main(String[] args) {

        TriAngle test = new TriAngle(2.1, 3);

        System.out.println("base = " + test.getBase() +"\n" + "height = " + test.getHeight());

        System.out.println("Area = " + test.Area());

    }
}
