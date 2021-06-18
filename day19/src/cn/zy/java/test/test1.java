package cn.zy.java.test;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-18 10:23
 **/
public class test1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);

        thread1.start();
        thread2.start();
    }
}


class MyThread implements Runnable{

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
