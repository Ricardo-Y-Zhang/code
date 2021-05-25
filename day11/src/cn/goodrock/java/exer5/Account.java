package src.cn.goodrock.java.exer5;

/**
 * @program: code
 * @description: 类模拟账户
 * @author: Mr.Yan
 * @create: 2021-05-21 16:03
 **/
public class Account {
    private int id;
    private double balance;
    private double annualInterersRate;

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterersRate = annualInterestRate;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterersRate(){
        return annualInterersRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterersRate(double annualInterersRate){
        this.annualInterersRate = annualInterersRate;
    }

    public double getMonthlyInterest(){
        return annualInterersRate / 12;
    }

    /**
     * description: 取款，考虑余额不足情况
     * @param  amount 取钱总额
     * @return  void
     * @author: Mr.Yan
     * @date: 2021/5/21
     **/
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("余额不足！");
        }else{
            balance -= amount;
        }
    }

    public void deposit(double amount){
        balance += amount;
    }


}
