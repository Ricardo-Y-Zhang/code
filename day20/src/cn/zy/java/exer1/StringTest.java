package cn.zy.java.exer1;

import org.junit.Test;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-18 15:22
 **/
public class StringTest {

    @Test
    public void test1(){

        //声明在方法区的字符串常量池中
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);
        s1 = "hello";

        System.out.println(s1);


        String s3 = s2 + "def";
        System.out.println("s3 = " + s3);

        String s4 = "abc";
        String s5 = s4.replace('a', 'm');

        System.out.println("s4 = " + s4 + " s5 = " + s5);

    }


    @Test
    public void test2(){
        String s1 = new String();

        String s2 = new String(s1);

        byte[] bytes = new byte[]{'a', 'b', 'c'};
        String s3 = new String(bytes);

        String s4 = new String(bytes, 0, 2);

    }

    @Test
    public void test3(){
        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
    }


    @Test
    public void test4(){
        String s1 = "abc";
        String s2 = "def";
        String s3 = "abcdef";

        String s4 = "abc" + "def";
        String s5 = s1 + "def";
        String s6 = "abc" + s2;
        String s7 = s1 + s2;
        String s8 = (s1 + s2).intern();

        System.out.println(s3 == s4);//true
        System.out.println(s5 == s3);//false
        System.out.println(s6 == s3);//false
        System.out.println(s7 == s3);//false
        System.out.println(s8 == s3);//true
    }

}
