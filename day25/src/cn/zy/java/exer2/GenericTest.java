package cn.zy.java.exer2;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @program: code
 * @description: 自定义泛型
 * @author: Mr.Yan
 * @create: 2021-07-06 11:03
 **/
public class GenericTest {


    @Test
    public void test1(){

        //实例化时，指明泛型类型
        Order<String> order = new Order<String>("orderAA", 1001, "01");

    }

}
