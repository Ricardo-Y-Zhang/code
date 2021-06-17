package cn.zy.java.exer12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-18 00:30
 **/
public class ThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //适合使用于Runnable
        Runnable runnable = new NumberThread();
        executorService.execute(runnable);

        //关闭连接池
        executorService.shutdown();

        //适合使用于Callable
        //executorService.submit();
    }
}

class NumberThread implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}
