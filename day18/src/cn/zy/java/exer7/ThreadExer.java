package cn.zy.java.exer7;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-16 09:56
 **/
public class ThreadExer {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        Thread thread = new Thread(myThread);

        thread.setName("线程一");

        thread.start();
    }
}



class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}