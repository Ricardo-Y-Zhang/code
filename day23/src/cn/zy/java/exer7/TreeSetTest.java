package cn.zy.java.exer7;

import cn.zy.java.exer4.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-01 16:06
 **/
public class TreeSetTest {

    //自然排序
    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        set.add(new Person("Tom", 18));
        set.add(new Person("Jerry", 19));
        set.add(new Person("Antony", 29));
        set.add(new Person("Tom", 20));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    //定制排序
    @Test
    public void test2(){
        Comparator<Person> comparator = new Comparator<>() {

            @Override
            public int compare(Person person, Person t1) {
                if (person.getName().equals(t1.getName())) {
                    return -Integer.compare(person.getAge(), t1.getAge());
                } else {
                    return person.getName().compareTo(t1.getName());
                }
            }
        };

        TreeSet set = new TreeSet(comparator);

        set.add(new Person("Tom", 18));
        set.add(new Person("Jerry", 19));
        set.add(new Person("Antony", 29));
        set.add(new Person("Tom", 20));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
