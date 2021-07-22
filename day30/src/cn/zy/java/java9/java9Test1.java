package cn.zy.java.java9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @program: code
 * @description: java9新特性
 * @author: Mr.Yan
 * @create: 2021-07-22 10:23
 **/
public class java9Test1 {

    //Stream API 加强
    @Test
    public void test1(){

        List<Integer> list = Arrays.asList(1, 4, 5, 23, 45, 56, 99, 2, 3, 54, 100, 87);

        //takeWhile()：返回从开头开始的满足要求的尽量多的元素
        list.stream().takeWhile(x -> x < 60).forEach(System.out::println);

        System.out.println();
        //dropWhile()：返回剩余的元素
        list.stream().dropWhile(x -> x < 60).forEach(System.out::println);
    }


    @Test
    public void test2(){
        //of()中可以包含null，不能只填充单个null
        Stream<Object> stream = Stream.of(null);

        //ofNullable()：形参变量是可以为null值的单个元素
        Stream<Object> stream1 = Stream.ofNullable(null);
    }


    @Test
    public void test3(){
        //iterate()：增加终止条件判断
        Stream.iterate(0, x -> x < 100, x -> x + 1).forEach(System.out::println);
    }


    //Optional提供了新的方法:stream()
    @Test
    public void test4(){
        ArrayList<String> list = new ArrayList<>();
        list.add("李淳罡");
        list.add("剑九黄");
        list.add("邓太阿");
        list.add("曹长卿");

        Optional<ArrayList<String>> optional = Optional.ofNullable(list);
        Stream<ArrayList<String>> stream = optional.stream();
        stream.flatMap(x -> x.stream()).forEach(System.out::println);
    }


}
