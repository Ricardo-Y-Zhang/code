package cn.zy.java.exer6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-05 15:52
 **/
public class CollectionTest1 {

    //键盘随机输入10个整数保存在list中，并按倒序、从大到小的顺序显示出来
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("请输入一个整数：");
            int i1 = scanner.nextInt();
            list.add(i1);
        }

        System.out.println("list = " + list);
        Collections.reverse(list);
        System.out.println("list = " + list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return -Integer.compare(integer, t1);
            }
        });

        System.out.println("list = " + list);
    }
}
