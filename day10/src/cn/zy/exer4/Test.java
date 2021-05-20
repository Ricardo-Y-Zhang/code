package src.cn.zy.exer4;

/**
 * @program: code
 * @description: 这是一个test类
 * @author: Mr.Yan
 * @create: 2021-05-17 15:35
 **/
public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy("Jack", 18);
        boy.shout();

        Girl girl = new Girl("Rose", 17);
        girl.marry(boy);

        Girl girl1 = new Girl("肉丝", 17);
        System.out.println(girl.compare(girl1));

    }
}
