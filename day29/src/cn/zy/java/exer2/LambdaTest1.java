package cn.zy.java.exer2;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @program: code
 * @description: Lambda表达式的使用
 * @author: Mr.Yan
 * @create: 2021-07-17 11:46
 **/
public class LambdaTest1 {

    //1. 无参无返回值
    @Test
    public void test1(){
        Runnable runnable = () -> {
            System.out.println("无参无返回值");
        };
        runnable.run();
    }

    //2. Lambda需要一个参数，无返回值
    @Test
    public void test2(){

        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumer.accept("Consumer接口");

        Consumer<String> consumer1 = (String s) -> {
            System.out.println(s);
        };

        consumer1.accept("一个参数，无返回值");
    }


    //3. 数据类型可以省略，由编译器推断得出，称为”类型推断“
    @Test
    public void test3(){

        Consumer<String> consumer = (s) -> {
            System.out.println(s);
        };

        consumer.accept("省略数据类型，类型推断");
    }

    //4. 只需一个参数时，参数的小括号可以省略
    @Test
    public void test4(){
        Consumer<String> consumer = s -> {
            System.out.println(s);
        };
        consumer.accept("一个参数时，省略小括号");
    }


    //5. Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test6(){
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                System.out.println(integer);
                return Integer.compare(integer, t1);
            }
        };

        System.out.println(comparator.compare(10, 20));

        Comparator<Integer> comparator1 = (o1, o2) -> {
            System.out.println(o1);
            return o1.compareTo(o2);
        };

        System.out.println(comparator1.compare(10, 20));
    }


    //6. 当Lambda体只有一条语句时，return与大括号若有，可以省略
    @Test
    public void test7(){

        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);

        System.out.println(comparator.compare(10, 20));
    }

}
