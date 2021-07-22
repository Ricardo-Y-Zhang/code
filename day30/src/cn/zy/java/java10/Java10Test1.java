package cn.zy.java.java10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-22 14:38
 **/
public class Java10Test1 {

    //java 10新特性：集合中新增的copyOf()，用于创建一个只读的集合
    @Test
    public void test1(){
        List<String> list = List.of("李淳罡", "邓太阿", "曹长卿", "王仙芝");
        List<String> copy = List.copyOf(list);
        System.out.println(list == copy);//true

        ArrayList<String> list1 = new ArrayList<>();
        List<String> copy1 = List.copyOf(list1);
        System.out.println(list1 == copy1);//false

    }
}
