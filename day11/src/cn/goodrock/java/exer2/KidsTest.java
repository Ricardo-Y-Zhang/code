package src.cn.goodrock.java.exer2;

/**
 * @program: code
 * @description: 继承类测试
 * @author: Mr.Yan
 * @create: 2021-05-20 21:28
 **/
public class KidsTest {
    public static void main(String[] args) {
        Kids kids = new Kids(18);

        kids.printAge();

        kids.setSex(1);

        kids.manOrWoman();

        kids.setSalary(999999);

        kids.employeed();
    }
}
