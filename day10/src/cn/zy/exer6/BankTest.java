package cn.zy.exer6;

/**
 * @program: code
 * @description: 测试类
 * @author: Mr.Yan
 * @create: 2021-05-18 10:04
 **/
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Jane", "Smith");

        bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().deposit(1000);

        bank.getCustomer(0).getAccount().withdraw(500);

        double balance = bank.getCustomer(0).getAccount().getBalance();

        System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为："+ balance);

        bank.addCustomer("老师", "ma");

        System.out.println("银行客户的个数为：" + bank.getNumberOfCustomer());
    }
}
