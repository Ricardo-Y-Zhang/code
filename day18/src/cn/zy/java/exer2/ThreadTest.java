package cn.zy.java.exer2;

import cn.zy.java.exer1.HelloWorld;

/**
 * @program: code
 * @description: 多线程创建方式一
 * @author: Mr.Yan
 * @create: 2021-06-15 14:18
 **/
public class ThreadTest{
//    1.创建一个继承于Thread类的子类
//    2.重写Thread类的run（）————此线程执行的操作声明在run（）中
//    3.创建Thread类的子类的对象
//    4.通过此对象调用start（）:启动当前线程；调用当前线程的run（）

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();

        //如下操作仍是在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println("main:" + i);
            }
        }
    }
}

class MyThread extends Thread{

    //重写run（），此线程执行的操作
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println("thread: " + i);
            }
        }
    }
}
