package cn.zy.java.exer2;

import org.junit.Test;

import java.util.Comparator;

/**
 * @program: code
 * @description: Lambda表达式的使用举例
 * @author: Mr.Yan
 * @create: 2021-07-16 17:26
 **/
public class LambdaTest {

    @Test
    public void test1(){

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Ricardo.L");
            }
        };

        runnable.run();

        System.out.println();

        Runnable runnable1 = () -> System.out.println("Ricardo-Y");
        runnable1.run();
    }


    @Test
    public void test2(){

        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return Integer.compare(integer, t1);
            }
        };
        System.out.println(comparator.compare(10, 20));

        Comparator<Integer> comparator1 = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(comparator1.compare(20, 10));

        Comparator<Integer> comparator2 = Integer :: compare;
        System.out.println(comparator2.compare(10, 10));
    }
}
