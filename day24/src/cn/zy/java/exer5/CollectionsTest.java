package cn.zy.java.exer5;

import org.junit.Test;

import java.util.*;

/**
 * @program: code
 * @description: Collections是操作Collection, Map的工具类
 * @author: Mr.Yan
 * @create: 2021-07-05 15:00
 **/
public class CollectionsTest {

    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(234);
        arrayList.add(-9);
        arrayList.add(0);

        //reverse(List)：反转List中元素的顺序
        System.out.println(arrayList);//[123, 234, -9, 0]
        Collections.reverse(arrayList);
        System.out.println(arrayList);//[0, -9, 234, 123]

        // shuffle(List)：对List集合元素进行随机排序
        Collections.shuffle(arrayList);
        System.out.println(arrayList);//[0, -9, 123, 234]

        // sort(List)：根据元素的自然顺序对指定List集合元素按升序排序
        Collections.sort(arrayList);
        System.out.println(arrayList);//[-9, 0, 123, 234]

        //sort(List, Comparator)：根据指定的Comparator产生的顺序对List集合元素进行排序
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return -Integer.compare(integer, t1);
            }
        });
        System.out.println(arrayList);//[234, 123, 0, -9]


        //swap(List, int, int)：将指定List集合中的i处元素和j处元素进行交换
        Collections.swap(arrayList, 0, 3);
        System.out.println(arrayList);//[-9, 123, 0, 234]


        //Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        Comparable max = Collections.max(arrayList);
        System.out.println("max = " + max);//max = 234

        //Object max(Collection, Comparator)：根据Comparator指定的顺序，返回给定集合中的最大元素
        Integer max1 = Collections.max(arrayList, new Comparator<Integer>() {
            //从大到小排序
            @Override
            public int compare(Integer integer, Integer t1) {
                return -Integer.compare(integer, t1);
            }
        });
        System.out.println("max1 = " + max1);//max1 = -9

        //int frequency(Collection, Object)：返回指定集合中指定元素的出现次数
        arrayList.add(-9);
        int frequency = Collections.frequency(arrayList, -9);
        System.out.println("frequency = " + frequency);//frequency = 2

    }


    @Test
    public void test2(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(213);
        arrayList.add(88);

        List<Object> dest = Arrays.asList(new Object[arrayList.size()]);

        Collections.copy(dest, arrayList);
        System.out.println("dest = " + dest);//dest = [123, 213, 88]
    }

    @Test
    public void test3(){
        ArrayList arrayList = new ArrayList();

        //返回的list即为线程安全的list
        List list = Collections.synchronizedList(arrayList);
    }
}
