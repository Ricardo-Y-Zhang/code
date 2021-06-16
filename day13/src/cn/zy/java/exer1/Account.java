package cn.zy.java.exer1;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-02 16:50
 **/
public class Account {
    private int id;
    private String key = "000000";
    private double balance;

    private static double ratio;
    private static double miniBalance = 1.0;
    private static int init = 10001;//自动生成id

    public Account(){
        id = init++;
    }

    public Account(String key, double balance){
        id = init++;
        this.key = key;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public double getBalance() {
        return balance;
    }

    public static double getRatio() {
        return ratio;
    }

    public static double getMiniBalance() {
        return miniBalance;
    }


    public void setKey(String key) {
        this.key = key;
    }

    public static void setRatio(double ratio) {
        Account.ratio = ratio;
    }

    public static void setMiniBalance(double miniBalance) {
        Account.miniBalance = miniBalance;
    }
}
