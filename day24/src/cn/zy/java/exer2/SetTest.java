package cn.zy.java.exer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @program: code
 * @description: 去除ArrrayList中的重复数据
 * @author: Mr.Yan
 * @create: 2021-07-02 13:57
 **/
public class SetTest {

    public ArrayList duplicateList(ArrayList list){
        //新建HashSet，利用HashSet去除重复元素
        HashSet set = new HashSet();

        set.addAll(list);

        return new ArrayList(set);
    }

    @Test
    public void test1(){

        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------------");

        list = duplicateList(list);
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    //面试题
    @Test
    public void test2(){
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");

        set.add(p1);
        set.add(p2);
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);//[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}]
        set.add(new Person(1001, "CC"));
        System.out.println(set);//[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}, Person{id=1001, name='CC'}]
        set.add(new Person(1001, "AA"));
        System.out.println(set);//[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}, Person{id=1001, name='CC'}, Person{id=1001, name='AA'}]
    }
}
