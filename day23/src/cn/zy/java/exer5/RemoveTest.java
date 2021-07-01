package cn.zy.java.exer5;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-01 13:53
 **/
public class RemoveTest {

    //区分remove(int index)和remove(Object obj)
    @Test
    public void test1(){
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//[1, 2]
    }

    private void updateList(ArrayList list){
        //默认调用remove(int index)
        list.remove(2);
        //list.remove(new Integer(2));
    }
}
