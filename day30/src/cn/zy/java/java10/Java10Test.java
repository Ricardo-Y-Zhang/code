package cn.zy.java.java10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @program: code
 * @description: java 10新特性
 * @author: Mr.Yan
 * @create: 2021-07-22 13:51
 **/
public class Java10Test {

    //局部变量的类型推断
    @Test
    public void test1(){

        //1. 声明变量时，根据所赋的值，推断变量的类型
        var num = 10;

        var list = new ArrayList<String>();

        //2. 遍历操作
        list.add("123");
        for(var i : list){
            System.out.println(i);
        }

    }

    @Test
    public void test2(){

        //1. 局部变量不赋值，就不能实现类型推断
        //var num;

        //2. Lambda表达式中，左边的函数式接口不能声明为var
        Supplier<Double> sup = () -> Math.random();
        //var sup = () -> Math.random();

        //3. 方法引用中，左边的函数式接口不能声明为var
        Consumer<String> con = System.out::println;
        //var con = System.out::println;

        //4. 数组的静态初始化，如下的情况也不可以
        int[] ints = {1, 2, 3, 4};
        //var ints = {1, 2, 3, 4};
    }

    @Test
    public void test3(){
        //1. 没有初始化的局部变量声明
        //var s = null;

        //2. 方法的返回类型
//        public var method(){
//            return 0;
//        }


        //6. catch块
//        try {
//
//        }catch (var e){
//            e.printStackTrace();
//        }

    }

    //3. 方法的参数类型
//        public void method1(var x){
//
//        }


    //4. 构造器的参数类型
//    public Java10Test(var x){
//
//    }

    //5. 属性：属性有默认值
//    var num = 10;

}
