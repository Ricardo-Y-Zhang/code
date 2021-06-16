package cn.zy.java.java8;

public interface CompareA {

    //静态方法：直接通过接口调用
    public static void method1(){
        System.out.println("CompareA:杭州");
    }


    //默认方法
    public default void method2(){
        System.out.println("CompareA:HangZhou");
    }

    public default void method3(){
        System.out.println("接口CompareA：method3");
    }
}
