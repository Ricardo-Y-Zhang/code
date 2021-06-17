package cn.zy.java.exer7;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: code
 * @description: Lock锁解决线程不安全问题 ———— JDK5.0新增
 * @author: Mr.Yan
 * @create: 2021-06-17 14:46
 **/
public class LockTest {

    public static void main(String[] args) {

        Window window = new Window();

        Thread thread1 = new Thread(window);
        Thread thread2 = new Thread(window);
        Thread thread3 = new Thread(window);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Window implements Runnable{

    private int ticket = 100;

    //1. 实例化ReentranLock
    private ReentrantLock lock = new ReentrantLock(true);//公平

    @Override
    public void run() {

        while(true) {
            try {


                //2. 调用lock（）
                lock.lock();

                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " : " + ticket);

                    ticket--;
                }else{
                    break;
                }
            }finally {

                //3. 调用解锁方法： unlock（）
                lock.unlock();
            }
        }
    }
}