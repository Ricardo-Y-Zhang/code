package cn.zy.java.exer11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: code
 * @description: 创建线程的方式三：实现Callable接口
 * @author: Mr.Yan
 * @create: 2021-06-17 19:52
 **/
public class ThreadNew {

    public static void main(String[] args) {

        //3. 创建Callable接口实现类的对象
        NumbThread numbThread = new NumbThread();

        //4. 创建FutureTask类的对象
        FutureTask futureTask = new FutureTask<>(numbThread);


        //5. 以FutureTask的对象作为参数创建Thread类的对象，并调用start（）
        new Thread(futureTask).start();

        try {
            //get（）返回值即为FutureTask构造器参数Callable实现类重写的call（）的返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}


//1. 创建实现Callable接口的实现类
class NumbThread implements Callable{


    //2. 实现call（）方法
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);

                sum += i;
            }
        }
        return sum;
    }
}
