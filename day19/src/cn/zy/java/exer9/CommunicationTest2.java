package cn.zy.java.exer9;

/**
 * @program: code
 * @description: 两个线程交替打印1-100
 * @author: Mr.Yan
 * @create: 2021-06-17 16:53
 **/
public class CommunicationTest2 {

    public static void main(String[] args) {

        Number2 number2 = new Number2();

        Thread thread1 = new Thread(number2);
        Thread thread2 = new Thread(number2);

        thread1.start();
        thread2.start();
    }
}

class Number2 implements Runnable{
    private int number;

    @Override
    public void run() {

        while(true){

            synchronized (this){

                //拿到同步监视器后，再唤醒阻塞的优先级高的线程
                notify();

                if(number <= 100){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " : " + number);
                    number++;


                    try {
                        //调用wait（）方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}
