package cn.zy.java.exer5;

/**
 * @program: code
 * @description: 使用同步机制将单例模式中的懒汉式改写为线程安全的
 * @author: Mr.Yan
 * @create: 2021-06-17 11:42
 **/
public class BankTest {
}


//懒汉式单例模式
class Bank{

    private static Bank instance = null;//共享数据
    //私有化构造器
    private Bank(){}

    //方式一：效率较差：当instance已经创建时，其他线程依旧需要等待
//    public static synchronized Bank getInstance(){
//
//        if (instance == null) {
//            instance = new Bank();
//        }
//        return instance;
//    }



    //方式二：
    public static Bank getInstance(){

        if (instance == null) {
            synchronized (Bank.class){
                if (instance == null) {

                    instance = new Bank();
                }
            }
        }

        return instance;
    }
}