package cn.zy.java.exer9;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: code
 * @description: 线程通信：使用两个线程交替打印1-100
 * @author: Mr.Yan
 * @create: 2021-06-17 16:35
 **/
public class CommunicationTest {

    public static void main(String[] args) {

        Number number = new Number();

        Thread thread1 = new Thread(number);
        Thread thread2 = new Thread(number);

        thread1.start();
        thread2.start();
    }
}

class Number implements Runnable{

    private int number = 1;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try {
                lock.lock();
                if(number <= 100){

                    System.out.println(Thread.currentThread().getName() + " : " + number);
                    number++;
                }else{
                    break;
                }
            }finally {
                lock.unlock();
            }


        }
    }
}