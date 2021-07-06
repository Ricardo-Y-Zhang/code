package cn.zy.java.exer3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: code
 * @description: 泛型在继承方面的体现
 * @author: Mr.Yan
 * @create: 2021-07-06 14:30
 **/
public class GenericTest {

    @Test
    public void test1(){
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list2.add("a");
        list2.add("b");

        //此时的list1和list2的类型不具有子父类关系
        //list1 = list2;//Incompatible types. Found: 'java.util.List<java.lang.String>', required: 'java.util.List<java.lang.Object>'

        show(list1);
        show(list2);
    }


    //通配符的使用
    public void show(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
