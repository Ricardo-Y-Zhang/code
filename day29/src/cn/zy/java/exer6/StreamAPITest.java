package cn.zy.java.exer6;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @program: code
 * @description: Stream实例化
 * @author: Mr.Yan
 * @create: 2021-07-17 20:16
 **/
public class StreamAPITest {

    //1. 通过集合
    @Test
    public void test1(){
        List<String> strings = Arrays.asList("abc", "abd", "jkl", "lmn", "xyz");
        //调用集合中的默认方法stream()：返回顺序流
        Stream<String> stream = strings.stream();

        //parallelStream()：返回并行流
        Stream<String> stream1 = strings.parallelStream();
    }

    //2. 通过数组
    @Test
    public void test2(){
        //调用Arrays类的static <T> Stream<T> stream(T[] array)：返回一个流
        int[] ints = {1, 2, 3, 4};
        IntStream stream = Arrays.stream(ints);
    }


    //3. 通过Stream的of()
    @Test
    public void test3(){

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
    }

    //4. 创建无限流
    @Test
    public void test4(){

        //迭代
        Stream.iterate(0, t->t+2).limit(10).forEach(System.out::println);

        //生成
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
