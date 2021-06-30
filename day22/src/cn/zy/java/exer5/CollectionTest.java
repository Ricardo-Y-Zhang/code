package cn.zy.java.exer5;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: code
 * @description: Collection接口方法
 * @author: Mr.Yan
 * @create: 2021-06-30 14:23
 **/
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();

        //add(object e)：将元素e添加到集合coll中
        coll.add("ab");
        coll.add(123);
        coll.add("bb");
        coll.add(LocalDateTime.now());


        //size()：获取添加的元素的个数
        System.out.println(coll.size());//4

        //addAll(Collection coll1)：将coll1集合中元素添加到当前的集合中
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("cc");
        coll.addAll(coll1);
        System.out.println(coll);//[ab, 123, bb, 2021-06-30T14:35:08.512787600, 456, cc]


        //clear()：清空集合元素
        coll.clear();

        //isEmpty()：判断当前集合是否为空
        System.out.println(coll.isEmpty());//true


        //contains()：
    }
}
