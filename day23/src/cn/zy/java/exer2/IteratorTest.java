package cn.zy.java.exer2;

import cn.zy.java.exer1.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-30 16:55
 **/
public class IteratorTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();

        coll.add("abc");
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        Iterator iterator = coll.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();

        coll.add("abc");
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        Iterator iterator = coll.iterator();
        //删除集合中的“Tom”
        while(iterator.hasNext()){
            Object next = iterator.next();

            if("Tom".equals(next)){//健壮性更好
                iterator.remove();
            }
        }

        Iterator iterator1 = coll.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
