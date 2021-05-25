package src.cn.goodrock.java.exer3;

/**
 * @program: code
 * @description: 子类Cylinder测试类
 * @author: Mr.Yan
 * @create: 2021-05-20 21:42
 **/
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        System.out.println("radius: " + cylinder.getRadius());

        System.out.println("length: " + cylinder.getLength());

        System.out.println("Volume: " + cylinder.findVolume());

        cylinder.setLength(2);

        cylinder.setRadius(1.5);

        System.out.println("radius: " + cylinder.getRadius());

        System.out.println("length: " + cylinder.getLength());

        System.out.println("Volume: " + cylinder.findVolume());
    }
}
