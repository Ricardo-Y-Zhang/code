package cn.zy.java.exer6;

import cn.zy.java.exer4.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-01 14:09
 **/
public class SetTest {


    @Test
    public void test1(){
        HashSet hashSet = new HashSet();

        hashSet.add(123);
        hashSet.add(456);
        hashSet.add(new Person("Tom", 18));
        hashSet.add("CC");
        hashSet.add("AA");

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
