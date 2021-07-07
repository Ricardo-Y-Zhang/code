package cn.zy.java.exer5;

import java.util.*;

/**
 * @program: code
 * @description: 定义操作数据库中的表的通用操作，增删改查操作
 * @author: Mr.Yan
 * @create: 2021-07-06 15:51
 **/
public class DAO <T>{
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity){
        map.put(id, entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity){
        if(map.containsKey(id)){
            map.put(id, entity);
        }
    }

    public List<T> list(){
        //方式一：
//        ArrayList<T> list = new ArrayList<>();
//
//        Set<String> keySet = map.keySet();
//
//        Iterator<String> iterator = keySet.iterator();
//        while(iterator.hasNext()){
//            String key = iterator.next();
//            T t = map.get(key);
//            list.add(t);
//        }

        //方式二：
        ArrayList<T> list = new ArrayList<>();

        Collection<T> values = map.values();

        list.addAll(values);
        return list;
    }

    public void delete(String id){
        map.remove(id);
    }
}
