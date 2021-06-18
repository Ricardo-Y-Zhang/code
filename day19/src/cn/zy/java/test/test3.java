package cn.zy.java.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-18 11:00
 **/
public class test3 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        MyThread3 myThread3 = new MyThread3();
        executorService.execute(myThread3);

        executorService.execute(myThread3);

        executorService.shutdown();
    }
}


class MyThread3 implements Runnable{

    private int num;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(num < 100){
                    System.out.println(Thread.currentThread().getName() + " : " + num);
                    num++;
                }else{
                    break;
                }
            }
        }
    }
}