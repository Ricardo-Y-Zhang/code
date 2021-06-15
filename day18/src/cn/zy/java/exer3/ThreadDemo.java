package cn.zy.java.exer3;

/**
 * @program: code
 * @description: 创建两个分线程，一个线程遍历100以内偶数，一个线程遍历100以内奇数
 * @author: Mr.Yan
 * @create: 2021-06-15 15:49
 **/
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
//
//        MyThread2 myThread2 = new MyThread2();
//
//        myThread1.start();
//
//        myThread2.start();

        //创建Thread类的匿名子类
       new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " : " + i);
                    }

                    if(i % 20 == 0){
                        yield();
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " : " + i);
                    }

                    if(i == 10){
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}


class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}