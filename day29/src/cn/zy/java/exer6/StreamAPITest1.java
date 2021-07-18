package cn.zy.java.exer6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-17 21:18
 **/
public class StreamAPITest1 {

    //1. 筛选与切片
    @Test
    public void test1(){
        List<Integer> list = Arrays.asList(9, 8, 7, 33, 1, 2, 3);

        Stream<Integer> stream = list.stream();

        //filter(Predicate p): 接收Lambda，从流中排除某些元素
        stream.filter(i -> i < 7).forEach(System.out::println);

        System.out.println();

        //limit(long maxSize)：截断流，使其元素不超过给定数量
        list.stream().limit(3).forEach(System.out::println);

        System.out.println();

        //skip(long n)：跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空留。与limit(n)互补
        list.stream().skip(3).forEach(System.out::println);

        System.out.println();

        //distinct()：筛选，通过流所生成元素的hashCode()和equals()去除重复元素
        ArrayList<Integer> integers = new ArrayList<>(list);
        integers.add(1);
        integers.add(2);

        integers.stream().distinct().forEach(System.out::println);
    }


    //2. 映射
    @Test
    public void test2(){
        //1. map(Function f)
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

        //获取员工姓名长度大于3的员工的姓名
        List<Employee> employees = Employee.getEmployees();
        employees.stream().map(e->e.getName()).filter(str->str.length()>2).forEach(System.out::println);


        //flatMap(Function f)
        Stream<Stream<Character>> streamStream = list.stream().map(StreamAPITest1::fromStringToStream);

        Stream<Character> characterStream = list.stream().flatMap(StreamAPITest1::fromStringToStream);
        characterStream.forEach(System.out::println);

    }

    //将字符串中的多个字符构成的集合转换为对应的Stream实例
    public static Stream<Character> fromStringToStream(String str){
        ArrayList<Character> list = new ArrayList<>();

        for(Character c : str.toCharArray()){
            list.add(c);
        }

        return list.stream();
    }


    //3. 排序
    @Test
    public void test3(){
        //sorted()：自然排序
        List<Integer> list = Arrays.asList(12, 32, 98, 33, 76, 53, -9);

        list.stream().sorted().forEach(System.out::println);


        List<Employee> employees = Employee.getEmployees();
        System.out.println("自然排序:");
        employees.stream().sorted().forEach(System.out::println);


        //sorted(Comparator com)：定制排序
        System.out.println("定制排序：");
        employees.stream().sorted((e1, e2)->Integer.compare(e2.getId(), e1.getId())).forEach(System.out::println);
    }




}
