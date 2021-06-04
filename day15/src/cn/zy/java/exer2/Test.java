package src.cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-04 14:27
 **/
public class Test {
    public static void main(String[] args) {
        CommonEmployee cm1 = new CommonEmployee("Jack", 18, 30000);

        cm1.work();

        //多态
        Employee m1 = new Manager("Juce", 20, 40000, 100000);
        //Manager m1 = new Manager("Juce", 20, 40000, 100000);

        //虚拟方法调用
        m1.work();
    }
}
