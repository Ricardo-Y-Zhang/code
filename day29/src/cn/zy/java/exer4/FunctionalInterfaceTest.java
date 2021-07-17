package cn.zy.java.exer4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @program: code
 * @description: 四大核心函数式接口
 * @author: Mr.Yan
 * @create: 2021-07-17 14:00
 **/
public class FunctionalInterfaceTest {

    @Test
    public void test1(){
        happyTime(12.9, money -> System.out.println(money));
    }

    public void happyTime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }



    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京", "南京", "天津", "东京", "西京", "普京");

        List<String> filterString1 = filterString(list, s -> s.contains("京"));
        System.out.println(filterString1);
    }

    //根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> strings = new ArrayList<>();

        for(String i : list){
            if(pre.test(i)){
                strings.add(i);
            }
        }

        return strings;
    }

}
