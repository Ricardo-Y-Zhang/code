package cn.zy.java.exer6;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: code
 * @description: Stream的终止操作
 * @author: Mr.Yan
 * @create: 2021-07-18 12:35
 **/
public class StreamAPITest2 {

    @Test
    public void test1(){
        //allMatch(Predicate p) ：检查是否匹配所有元素
        List<Employee> employees = Employee.getEmployees();
        System.out.println(employees.stream().allMatch(e -> e.getId() >= 1000));//true

        //anyMatch(Predicate p)
        System.out.println(employees.stream().anyMatch(e -> e.getId() >= 1004));//true

        //noneMatch(Predicate p)
        System.out.println(employees.stream().noneMatch(e -> e.getId() == 1004));//false

        //findFirst
        Optional<Employee> first = employees.stream().findFirst();//Optional[Employee{name='马云', id=1000}]
        System.out.println(first);

        //findAny
        Optional<Employee> any = employees.stream().findAny();
        System.out.println(any);

        //count
        System.out.println(employees.stream().count());//4

        //max(Comparator c)
        Optional<Employee> max = employees.stream().max((e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println(max);//Optional[Employee{name='马化腾', id=1001}]

        //min(Comparator c)
        Optional<Employee> min = employees.stream().min((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
        System.out.println(min);//Optional[Employee{name='马云', id=1000}]

        //forEach(Consumer c)
        employees.stream().forEach(System.out::println);
    }


    //2. 归约
    @Test
    public void test3(){

        //reduce(T identity, BinaryOperator)
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);


        //reduce(BinaryOperator)
        List<Employee> employees = Employee.getEmployees();
        Optional<Integer> sum1 = employees.stream().map(e -> e.getId()).reduce((i1, i2)->i1+i2);
        System.out.println(sum1);

    }

    @Test
    public  void test4(){
        //collect(Collector c)

        //1. list
        List<Employee> employees = Employee.getEmployees();
        List<Employee> collect = employees.stream().filter(e -> e.getId() > 1001).collect(Collectors.toList());

        System.out.println(collect);

        //2. set
        Set<Employee> collect1 = employees.stream().filter(e -> e.getId() <= 1001).collect(Collectors.toSet());

    }
}
