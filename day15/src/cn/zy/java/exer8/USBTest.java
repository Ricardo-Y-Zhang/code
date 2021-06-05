package src.cn.zy.java.exer8;

/**
 * @program: code
 * @description: 接口的多态性，接口实际就是定义规范
 * @author: Mr.Yan
 * @create: 2021-06-05 19:14
 **/
public class USBTest {
    public static void main(String[] args) {

        Computer com = new Computer();

        //多态性
        //1.创建接口的非匿名类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);

        //2.创建接口的非匿名类的匿名对象
        com.transferData(new Flash());


        //3.创建接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开启工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        com.transferData(phone);

        //4.创建接口的匿名实现类的匿名对象
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("UNKOWN开启工作");
            }

            @Override
            public void stop() {
                System.out.println("UNKNOWN结束工作");
            }
        });
    }
}


class Computer{
    public void transferData(USB usb){
        usb.start();

        System.out.println("具体传输细节");

        usb.stop();
    }
}

interface USB{
    public abstract void start();

    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}