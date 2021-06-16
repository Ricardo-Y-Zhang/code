package cn.zy.java.exer1;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-02 17:08
 **/
public class AccountTest {
    public static void main(String[] args){
        Account account1 = new Account("123456", 10000);

        Account account2 = new Account();

        //静态方法，通过类.静态方法名直接调用
        Account.setRatio(0.012);

        System.out.println("interestRate: " + Account.getRatio());

    }
}
