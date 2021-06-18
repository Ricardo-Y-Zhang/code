package cn.zy.java.test;

import javax.swing.plaf.FontUIResource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-18 10:31
 **/
public class test2 {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();

        FutureTask futureTask1 = new FutureTask<>(myThread);
        FutureTask futureTask2 = new FutureTask<>(myThread);

        new Thread(futureTask1).start();
        new Thread(futureTask2).start();

        try {
            System.out.println(Thread.currentThread().getName() + " : sum = " + futureTask1.get());
            System.out.println(Thread.currentThread().getName() + " : sum = " + futureTask2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}


class MyThread2 implements Callable{


    private int num;
    @Override
    public Object call() throws Exception {

        int sum = 0;
        while(true){

            synchronized (this){
                if(num < 100){
                    sum += num;
                    System.out.println(Thread.currentThread().getName() + " : " + num);
                    num++;
                }else{
                    break;
                }
            }
        }
        return sum;
    }
}