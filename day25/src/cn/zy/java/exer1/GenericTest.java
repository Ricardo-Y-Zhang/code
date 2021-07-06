package cn.zy.java.exer1;

import jdk.jfr.StackTrace;
import org.junit.Test;

import java.util.*;

/**
 * @program: code
 * @description: 泛型
 * @author: Mr.Yan
 * @create: 2021-07-06 10:11
 **/
public class GenericTest {

    //在集合中使用泛型之前
    @Test
    public void test1(){
        ArrayList list = new ArrayList();

        //需求：保存学生成绩
        list.add(100);
        list.add(99);
        //问题一：类型不安全
        list.add("abc");

        for(Object obj : list){
            //问题二：强转时，出现ClassCastException
            int num = (Integer)obj;
        }
    }


    //在集合中使用泛型的情况
    @Test
    public void test2(){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(99);
        //list.add("abc");//编译时，进行类型检查，无法add
        for(Integer grade : list){
            //避免强转操作
            System.out.println("grade = " + grade);
        }

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int score = iterator.next();
            System.out.println("score = " + score);
        }
    }

    @Test
    public void test3(){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("ab", 1);
        map.put("aa", 2);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
        }
    }
}
