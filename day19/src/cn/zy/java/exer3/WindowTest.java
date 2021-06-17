package cn.zy.java.exer3;

/**
 * @program: code
 * @description: 同步方法解决线程不安全问题
 * @author: Mr.Yan
 * @create: 2021-06-17 10:30
 **/
public class WindowTest {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread implements Runnable{

    private int ticket = 100;
    @Override
    public void run() {

        while(true){

            show();
        }
    }

    public synchronized void show(){//同步监视器：this

        if(ticket > 0){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + ticket);

            ticket--;
        }
    }
}