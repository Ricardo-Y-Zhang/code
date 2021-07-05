package cn.zy.java.exer3;

import org.junit.Test;

import java.util.*;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-02 15:07
 **/
public class MapTest {

    @Test
    public void test1(){
        HashMap map = new HashMap();

        map.put(null,null);
    }


    @Test
    public void test2(){
        LinkedHashMap map = new LinkedHashMap();

        map.put(123, "AA");
        map.put(345, "BB");
        map.put(12, "CC");

        System.out.println(map);//有序
    }

    @Test
    public void test3(){
        //Object put(Object key, Object value)：将指定key-value添加到（或修改）当前map对象中
        HashMap map = new HashMap();
        map.put("AA",123);
        map.put(45, 123);
        map.put("BB", 56);

        //void putAll(Map m)：将m中所有的key-value对存放到当前map中
        HashMap map1 = new HashMap();
        map1.put("CC", 123);
        map.putAll(map1);
        System.out.println(map);//{AA=123, BB=56, CC=123, 45=123}

        //Object remove(Object key)：移除指定key的key-value对，并返回value
        System.out.println(map.remove(45));//123

        //void clear()：清空当前map中的所有数据
        map.clear();
        System.out.println(map.size());//0
    }

    @Test
    public void test4(){
        HashMap map = new HashMap();
        map.put("AA",123);
        map.put(45, 123);
        map.put("BB", 56);

        //Object get(Object key)：获取指定key对应的value
        System.out.println(map.get("AA"));//123
        System.out.println(map.get("CC"));//null

        //boolean containsKey(Object key)：是否包含指定的key
        System.out.println(map.containsKey("CC"));//false

        //boolean containsValue(Object value)：是否包含指定的value
        System.out.println(map.containsValue(56));//true

        //int size()：返回map中key-value对的个数
        System.out.println(map.size());//3

        //boolean isEmpty()：判断当前map是否为空
        System.out.println(map.isEmpty());//false

        //boolean equals(Object obj)：判断当前map和参数对象obj是否相等
        LinkedHashMap map1 = new LinkedHashMap();
        map1.put(123, 356);
        System.out.println(map.equals(map1));//false
    }


    //遍历map，map中没有iterator
    @Test
    public void test5(){
        HashMap map = new HashMap();
        map.put("AA",123);
        map.put(45, 12);
        map.put("BB", 56);

        //Set keySet()：返回所有key构成的Set集合
        //map的key存储于set中
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            System.out.println("key = " + key);
            System.out.println("map.get(key) = " + map.get(key));
        }

        // Collection values()：返回所有value构成的Collection集合
        Collection values = map.values();
        for(Object obj : values){
            System.out.println(obj);
        }

        //Set entrySet()：返回所有key-value对构成的Set集合
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Object next = iterator1.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }
    }


    //TreeMap
    @Test
    public void test6(){
        TreeMap treeMap = new TreeMap();

        User u1 = new User("Tom", 18);
        User u2 = new User("Tom", 28);
        User u3 = new User("Jack", 24);
        User u4 = new User("Paul", 36);

        treeMap.put(u1, 98);
        treeMap.put(u2, 89);
        treeMap.put(u3, 76);
        treeMap.put(u4, 100);

        Set keySet = treeMap.keySet();
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key + "----->" + treeMap.get(key));
        }


        TreeMap treeMap1 = new TreeMap(new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                if (user.getName().equals(t1.getName())) {
                    return Integer.compare(user.getAge(), t1.getAge());
                } else {
                    return t1.getName().compareTo(user.getName());
                }
            }
        });
    }
}
