package cn.zy.java.exer4;

import org.junit.Test;

import java.util.*;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-01 09:53
 **/
public class ListTest {

    @Test
    public  void test1(){

        ArrayList list = new ArrayList();

        list.add(123);
        list.add(456);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom", 18));

        //void add(int index, Object ele)：在index位置插入ele元素
        list.add(1, "BB");
        System.out.println(list);//[123, BB, 456, 456, AA, Person{name='Tom', age=18}]

        //boolean addAll(int index, Collection eles)：从index位置开始将eles中的所有元素添加进来
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(1, list1);
        System.out.println(list);//[123, 1, 2, 3, BB, 456, 456, AA, Person{name='Tom', age=18}]


        //Object get(int index)：获取指定index位置的元素
        System.out.println(list.get(4));//BB


        //int indexOf(Object obj)：返回obj在当前集合中首次出现的位置
        System.out.println(list.indexOf(456));//5

        //int lastIndexOf(Object obj)：返回obj在当前集合中末次出现的位置
        System.out.println(list.lastIndexOf(456));//6

        //Object remove(int index)：移除指定index位置的元素，并返回此元素
        Object remove = list.remove(1);
        System.out.println(remove);//1
        System.out.println(list);//[123, 2, 3, BB, 456, 456, AA, Person{name='Tom', age=18}]


        //Object set(int index, Object ele)：设置指定index位置上的元素为ele，返回修改前的元素
        Object cc = list.set(3, "CC");
        System.out.println(cc);//BB
        System.out.println(list);//[123, 2, 3, CC, 456, 456, AA, Person{name='Tom', age=18}]

        //List subList(int fromIndex, int toIndex)：返回从fromIndex到toIndex的子集合（左闭右开）
        List list2 = list.subList(0, 3);
        System.out.println(list2);//[123, 2, 3]
    }


    @Test
    public void test2(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom", 18));

        //Iterator迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //foreach循环
        for(Object temp : list){
            System.out.println(temp);
        }

        //for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
