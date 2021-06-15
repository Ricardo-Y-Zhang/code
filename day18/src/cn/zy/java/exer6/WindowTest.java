package cn.zy.java.exer6;

/**
 * @program: code
 * @description: 使用实现Runnable接口的方式
 * @author: Mr.Yan
 * @create: 2021-06-15 19:20
 **/
public class WindowTest {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        Thread w1 = new Thread(myThread);

        Thread w2 = new Thread(myThread);

        Thread w3 = new Thread(myThread);

        w1.setName("窗口一");

        w2.setName("窗口二");

        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }
}

class MyThread implements Runnable{
    private int tickets = 100;
    @Override
    public void run() {
        while(true){
            if(tickets > 0){
                System.out.println(Thread.currentThread().getName() + " : 买票，票号为" + tickets);
                tickets--;
            }
        }
    }
}
