package cn.zy.java.exer10;

/**
 * @program: code
 * @description: 生产者/消费者问题
 * @author: Mr.Yan
 * @create: 2021-06-17 17:26
 **/
public class ProductTest {

    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Producer producer = new Producer(clerk);

        Consumer consumer = new Consumer(clerk);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}

class Clerk{
    private int productNumber;

    public synchronized void produce(){

        if(productNumber < 20){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            productNumber++;

            System.out.println(Thread.currentThread().getName() + "开始生产第" + productNumber + "个产品");

            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consume(){

        if(productNumber > 0){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "开始消费第" + productNumber + "个产品");

            productNumber--;

            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable{

    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println("开始生产产品");
        while(true){


            clerk.produce();
        }
    }
}

class Consumer implements Runnable{

    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {

        System.out.println("开始消费产品");
        while(true){

            clerk.consume();
        }
    }
}
