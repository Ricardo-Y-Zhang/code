package cn.zy.java.exer8;

import javax.crypto.interfaces.PBEKey;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: code
 * @description: 两人分别向同一个账户中存钱，三次每次存1000，解决线程安全问题
 * @author: Mr.Yan
 * @create: 2021-06-17 15:24
 **/
public class LockTest {
    public static void main(String[] args) {

        Account account = new Account();

        Person person = new Person(account);
        Thread thread1 = new Thread(person);
        Thread thread2 = new Thread(person);

        thread1.setName("张三");
        thread2.setName("法外狂徒");

        thread1.start();
        thread2.start();

    }
}

class Account{
    //共享数据
    private int balance;



    //多线程操作共享数据，线程不安全
    //同步监视器为this，即为account，是唯一的，不需要定义为static（定义为static，同步监视器为Account.class）
    public synchronized void deposit(int money){

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance += money;

        System.out.println(Thread.currentThread().getName() + "      余额：" + balance);
    }
}


//创建多线程的方式：实现Runnable接口
class Person implements Runnable{

    //同一个account
    private Account account;

    public Person(Account account){
        this.account = account;
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}