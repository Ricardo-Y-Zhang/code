package src.cn.goodrock.java.exer5;

/**
 * @program: code
 * @description: 子类CheckAcount的测试类
 * @author: Mr.Yan
 * @create: 2021-05-21 16:43
 **/
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);

        checkAccount.withdraw(5000);

        System.out.println("余额为：" + checkAccount.getBalance() + "\n可透支额：" + checkAccount.getOverdraft() + "\n***********");

        checkAccount.withdraw(18000);

        System.out.println("余额为：" + checkAccount.getBalance() + "\n可透支额：" + checkAccount.getOverdraft()+ "\n***********");

        checkAccount.withdraw(3000);

        System.out.println("余额为：" + checkAccount.getBalance() + "\n可透支额：" + checkAccount.getOverdraft()+ "\n***********");

    }
}
