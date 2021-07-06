package cn.zy.java.exer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-06 13:48
 **/
public class GenericTest1 {

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3};
        //泛型方法调用时，指明泛型参数的类型
        List<Integer> integers1 = copyFormArrayToList(integers);
    }


    public static <E> List<E> copyFormArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<E>();

        for(E e : arr){
            list.add(e);
        }
        return list;
    }

}
