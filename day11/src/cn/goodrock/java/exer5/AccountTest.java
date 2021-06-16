package cn.goodrock.java.exer5;

/**
 * @program: code
 * @description: 账户测试类
 * @author: Mr.Yan
 * @create: 2021-05-21 16:18
 **/
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);

        account.withdraw(30000);

        System.out.println("余额为：" + account.getBalance());

        account.withdraw(2500);

        account.deposit(3000);

        System.out.println("余额为：" + account.getBalance() + "\n月利率为：" + account.getMonthlyInterest());
    }
}
