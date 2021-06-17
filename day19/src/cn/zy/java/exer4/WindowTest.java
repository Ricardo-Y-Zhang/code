package cn.zy.java.exer4;

/**
 * @program: code
 * @description: 同步方法解决继承Thread类的线程不安全问题
 * @author: Mr.Yan
 * @create: 2021-06-17 10:58
 **/
public class WindowTest {

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();

        MyThread myThread2 = new MyThread();

        MyThread myThread3 = new MyThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();




    }
}


class MyThread extends Thread{

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {

            show();
        }
    }

    private static synchronized void show(){//同步监视器：Window.class
        //private synchronized void show(){//同步监视器：thread1，thread2，thread3；此种解决方式是错误的
        if (ticket > 0) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " : " + ticket);

            ticket--;
        }
    }
}