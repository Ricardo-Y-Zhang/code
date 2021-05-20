package src.cn.zy.exer6;

/**
 * jjijif
 * @program: code
 * @description: 模拟账户
 * @author: Mr.Yan
 * @create: 2021-05-17 16:23
 **/
public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount){
        balance += amount;
        System.out.println("存款成功\n" + "余额为：" + balance);
    }
    

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("取款成功\n" + "余额为：" + balance);
        }else{
            System.out.println("余额不足");
        }
    }

}
