package cn.zy.java.exer5;



/**
 * @program: code
 * @description: 创建多线程的方式二：实现Runnable接口
 * @author: Mr.Yan
 * @create: 2021-06-15 18:58
 **/


//  1. 创建一个实现了Runnable接口的类
//  2. 实现类去实现Runnable张的抽象方法：run（）
//  3. 创建实现类的对象
//  4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
//  5. 通过Thread类的对象调用start（）
public class ThreadTest {

    public static void main(String[] args) {
        //3. 创建实现类的对象
        MyThread myThread = new MyThread();

        //4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象（多态）
        Thread thread = new Thread(myThread);

        //5. 通过Thread类的对象调用start（）：①启动线程 ②调用当前线程的run（）——> 调用了Runnable类型的target的run（）
        thread.start();
    }
}


//1. 创建一个实现了Runnable接口的类
class MyThread implements Runnable{

    //实现类去实现Runnable中的抽象方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
