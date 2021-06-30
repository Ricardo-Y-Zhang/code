package cn.zy.java.exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-30 15:30
 **/
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add("abc");
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));


        //contains(Object obj)：判断当前集合中是否包含obj，调用obj所在类的equals（）比较
        System.out.println(coll.contains(123));//true
        System.out.println(coll.contains(new String("Tom")));//true
        System.out.println(coll.contains(new Person("Jerry", 20)));//false，未重写equals()


        //containsAll(Collection coll1)：判断形参coll1的所有元素是否都存在于当前集合中
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(false);

        System.out.println(coll.containsAll(coll1));//true
    }


    @Test
    public void test2(){

        //remove(Object obj)：从当前集合中删除obj元素，返回删除结果
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        System.out.println(coll.remove(123));//true， remove成功


        //removeAll(Collection coll1)：从当前集合中移除coll1中所有的元素
        Collection coll1 = new ArrayList();
        coll1.add("abc");
        coll1.add(false);
        coll1.add(new String("Tom"));
        coll1.add(456);

        coll.removeAll(coll1);
        System.out.println(coll);//[Person{name='Jerry', age=20}]
    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));


        //retainAll(Collection coll1)：获取当前集合和coll1集合的交集，并赋给当前集合
        Collection coll1 = Arrays.asList(123, 456, false);
        coll.retainAll(coll1);
        System.out.println(coll);//[123, false]
    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);


        //equals(Object obj)：判断当前集合和形参集合的元素是否相同
        Collection coll1 = Arrays.asList("abc", 123, "Tom", false);
        System.out.println(coll.equals(coll1));
    }

    @Test
    public void test5(){
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry", 20));

        //hashCode()：返回当前对象的hash值
        System.out.println(coll.hashCode());


        //toArray()：集合转换为数组
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

}
