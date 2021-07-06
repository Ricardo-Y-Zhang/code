package cn.zy.java.exer4;

import org.junit.Test;

import java.util.List;

/**
 * @program: code
 * @description: 有限制条件的通配符
 * @author: Mr.Yan
 * @create: 2021-07-06 15:13
 **/
public class GenericTest {

    @Test
    public void test1(){
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = null;
        List<Person> list4 = null;
        List<Object> list5 = null;

        list1 = list3;
        list1 = list4;
        //list1 = list5;//编译错误

        //list2 = list3;//编译错误
        list2 = list4;
        list2 = list5;
    }

}
