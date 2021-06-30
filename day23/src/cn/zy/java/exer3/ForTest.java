package cn.zy.java.exer3;

import cn.zy.java.exer1.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: code
 * @description: foreach
 * @author: Mr.Yan
 * @create: 2021-06-30 19:39
 **/
public class ForTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        //for(集合元素的类型 局部变量 ： 集合对象)
        for(Object obj : coll){
            System.out.println(obj);
        }
    }
}
