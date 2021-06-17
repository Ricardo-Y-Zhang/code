package cn.zy.java.exer1;

/**
 * 问题：卖票过程中，出现了重票、错票 ——> 线程安全问题
 * 原因：某个线程操作车票过程中，尚未操作完成时，其他线程参与进来，也操作车票
 * 解决：当一个线程在操作ticket的时候，其他线程不能参与进来，直到该线程操作完ticket时，其他线程才可以操作ticket。
 * 这种情况即使该线程出现了阻塞，也不会被改变
 *
 * 在Java中，通过同步机制，来解决线程的安全问题
 *
 * 方式一：同步代码块
 * synchronized（同步监视器）{
 *     //需要被同步的代码
 * }
 * 说明：1. 操作共享数据的代码，即为需要被同步的代码
 *      2. 共享数据：多个线程共同操作的变量。如：ticket就是共享数据
 *      3. 同步监视器（锁）。任何一个类的对象都可以充当锁
 *          要求：多个线程必须要共用同一把锁
 *
 *          补充：在实现Runnable接口创建多线程的方式中，可以考虑使用this充当同步监视器
 *               在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器
 *
 *
 * 方式二：同步方法
 *      如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此方法声明同步的。
 *
 *
 *      总结：
 *      1. 同步方法仍然设计到同步监视器，只是不需要我们显式的声明
 *      2. 非静态的同步方法，同步监视器：this
 *         静态的同步方法，同步监视器：当前类本身
 *
 * 同步的方式，解决了线程的安全问题 —— 好处
 * 操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低。
 *
 * @program: code
 * @description: 解决线程安全问题
 * @author: Mr.Yan
 * @create: 2021-06-15 18:37
 **/
public class WindowTest {
    public static void main(String[] args) {

        Window w = new Window();

        Thread thread1 = new Thread(w);

        Thread thread2 = new Thread(w);

        Thread thread3 = new Thread(w);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Window implements Runnable{
    private int ticket = 100;//共享数据

    Object obj = new Object();//传同一个对象，为同一把锁

    @Override
    public void run() {


        while(true) {

            //synchronized (obj) {
            synchronized(this){//接口的实现类的对象w（唯一的）
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " : 卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
