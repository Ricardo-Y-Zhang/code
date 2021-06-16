package cn.zy.java.exer1;

/**
 * @program: code
 * @description: 存在线程安全问题，待解决
 * @author: Mr.Yan
 * @create: 2021-06-15 18:37
 **/
public class WindowTest {
    public static void main(String[] args) {

        Window w1 = new Window();

        Window w2 = new Window();

        Window w3 = new Window();

        w1.setName("窗口一");

        w2.setName("窗口二");

        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {

        while(true){

            if (ticket > 0) {
                System.out.println(getName() + " : 卖票，票号为" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
