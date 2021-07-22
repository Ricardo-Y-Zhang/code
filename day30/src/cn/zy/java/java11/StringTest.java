package cn.zy.java.java11;

import org.junit.Test;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-22 15:24
 **/
public class StringTest {

    //String中新增的方法
    @Test
    public void test1(){
        //isBlank()：字符串是否是空白
        var str = "    \n   \t   ";
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//true

        //strip()：去除首位的空白（包含\n, \t）
        System.out.println("-------" + str.strip() + "------");//-------------

        //stripTrailing()：去除尾部空格
        System.out.println("------" + "     abc     ".stripTrailing() + "------");//------     abc------

        //stripLeading()：去除首部空格
        System.out.println("-----" + "     abc     ".stripLeading() + "-----");//-----abc     -----

        //repeat(int count)：复制字符串，count次数
        var str1 = "abc";
        var str2 = str1.repeat(4);
        System.out.println(str2);//abcabcabcabc


        //lines().count()：行数统计
        String str3 = "abcdef\nsfa";
        System.out.println(str3.lines().count());//2
    }
}
