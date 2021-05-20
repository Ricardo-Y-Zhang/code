package src.cn.zy.exer5;


/**
 * @program: code
 * @description: 模拟账户
 * @author: Mr.Yan
 * @create: 2021-05-17 15:49
 **/
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;


    public Account(){}

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId(){
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
    * @Description: 取钱，余额不足时报错
    * @Param: [amount]
    * @return: void
    * @Author: Mr.Yan
    * @Date: 2021/5/17
    */
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("余额不足");
        }else{
            balance -= amount;
            System.out.println("取款成功");
        }
    }


    /**
    * @Description: 存款
    * @Param: [amount]
    * @return: void
    * @Author: Mr.Yan
    * @Date: 2021/5/17
    */
    public void deposit(int amount){
        balance += amount;
        System.out.println("存款成功\n"+"余额：" + balance);

    }
}
