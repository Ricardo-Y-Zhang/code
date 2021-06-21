package cn.zy.java.exer3;

import org.junit.Test;

import java.util.Locale;

/**
 * @program: code
 * @description: 测试String类中方法
 * @author: Mr.Yan
 * @create: 2021-06-21 15:58
 **/
public class StringMethod {

    @Test
    public void test1(){
        String s1 = "helloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());

        String s2 = s1.toUpperCase();//s1是不可变的
        System.out.println(s2);
        System.out.println(s1);


        String s3 = "   hel    lo  world  ";
        String s4 = s3.trim();
        System.out.println("***" + s3 + "***");
        System.out.println("***" + s4 + "***");


        System.out.println(s1.equalsIgnoreCase(s2));

        String s5 = s1.concat("!");
        System.out.println(s5);

        String s6 = "abc";
        String s7 = "abe";
        System.out.println(s6.compareTo(s7));

        String s8 = s1.substring(5);
        System.out.println(s8);
    }

    @Test
    public void test2(){

        String str1 = "helloworld";

        System.out.println(str1.endsWith("ld"));
        System.out.println(str1.startsWith("hello"));
        System.out.println(str1.startsWith("ll", 2));


        System.out.println(str1.contains("el"));

        System.out.println(str1.indexOf("ll"));
        System.out.println(str1.indexOf("l", 3));


        String str2 = "hellohelloworld";
        System.out.println(str2.lastIndexOf("ll"));
        System.out.println(str2.lastIndexOf("ll", 6));

    }

    @Test
    public void test3(){
        String str1 = "helloworld";

        System.out.println(str1.replace('o', 'O'));

        System.out.println(str1.replace("world", "世界"));
    }
}
