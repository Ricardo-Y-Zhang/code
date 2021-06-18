package cn.zy.java.test;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-18 10:17
 **/
public class test {

    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();

        myThread1.start();
        myThread2.start();

    }
}


class MyThread1 extends Thread{

    private static int num;

    //重写run（）
    @Override
    public void run() {

        while(true){

            synchronized (MyThread1.class){

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
