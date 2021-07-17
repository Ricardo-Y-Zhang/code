package cn.zy.java.exer5;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @program: code
 * @description: 方法引用
 * @author: Mr.Yan
 * @create: 2021-07-17 14:38
 **/
public class MethodReTest {

    /*1. 对象 :: 实例方法
        void accept(T t);
        void println(T t);
     */
    @Test
    public void test1(){
        Consumer<String> consumer = str -> System.out.println(str);

        consumer.accept("Ricardo");

        PrintStream out = System.out;

        Consumer<String> consumer1 = out :: println;
        consumer1.accept("Ricardo");
    }


    /* 2. 类 :: 静态方法
        Comparator中的int compare(T t1, T t2);
        Integer中的int compare(T t1, T t2);
     */
    @Test
    public void test2(){
        Comparator<Integer> comparator = Integer :: compare;
        System.out.println(comparator.compare(10, 20));
    }


    /*
        3. 类 :: 非静态方法
        Comparator中的int compare(T t1, T t2);
        String中的int t1.compareTo(t2);

     */
    @Test
    public void test3(){

        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);

        System.out.println(comparator.compare("abc", "abd"));


        Comparator<String> comparator1 = String :: compareTo;
        System.out.println(comparator1.compare("abc", "abd"));
    }





}
