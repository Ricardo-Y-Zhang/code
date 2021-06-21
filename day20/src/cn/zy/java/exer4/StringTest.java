package cn.zy.java.exer4;

import org.junit.Test;

import java.lang.management.BufferPoolMXBean;
import java.util.Arrays;

/**
 * @program: code
 * @description: String与基本数据类型、包装类的转换
 * @author: Mr.Yan
 * @create: 2021-06-21 18:52
 **/
public class StringTest {

    @Test
    public void test1(){

        int num = Integer.parseInt("123");
        System.out.println(num + 1);


        double num1 = Double.parseDouble("123.4");
        System.out.println(num1 + 0.1);
    }


    @Test
    public void test2(){

        int num1 = 123;
        String str1 = String.valueOf(num1);
        System.out.println(str1 + 1);

        boolean flag = true;
        String str2 = String.valueOf(flag);
        System.out.println(str2 + 1);
    }

    @Test
    public void test3(){

        String str = "123中国";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }


        String str1 = new String(charArray);
        System.out.println(str1);
    }

    @Test
    public void test4(){

        String str = "abc123中国";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        String s = new String(bytes, 0, 3);
        System.out.println(s);

    }
}
