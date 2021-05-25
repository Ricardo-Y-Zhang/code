package src.cn.goodrock.java.exer5;

/**
 * @program: code
 * @description: Account子类，可透支账户
 * @author: Mr.Yan
 * @create: 2021-05-21 16:32
 **/
public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void withdraw(double amount){
        if(getBalance() >= amount){//余额足够消费
            super.withdraw(amount);
        }else if (getBalance() + overdraft >= amount){//可透支额足够
            //更新可透支额
            overdraft -= amount - getBalance();
            //更新余额为0
            super.withdraw(getBalance());
        }else{
            System.out.println("超过可透支额的限额");
        }
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
