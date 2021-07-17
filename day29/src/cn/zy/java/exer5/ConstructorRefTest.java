package cn.zy.java.exer5;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @program: code
 * @description: 构造器引用
 * @author: Mr.Yan
 * @create: 2021-07-17 16:23
 **/
public class ConstructorRefTest {

    @Test
    public void test1(){

        Supplier<Person> supplier = new Supplier<Person>() {
            @Override
            public Person get() {
                return new Person();
            }
        };

        //Lambda表达式
        Supplier<Person> supplier1 = () -> new Person();

        //构造器引用
        Supplier<Person> supplier2 = Person::new;

    }


    //数组引用
    @Test
    public void test2(){

        Function<Integer, String[]> func1 = length -> new String[length];
        System.out.println(Arrays.toString(func1.apply(5)));

        Function<Integer, String[]> func2 = String[]::new;
        System.out.println(Arrays.toString(func2.apply(5)));
    }
}
