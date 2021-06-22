package cn.zy.java.exer6;

import org.junit.Test;

import java.util.Date;

/**
 * @program: code
 * @description: JDK8之前日期时间的API测试
 * @author: Mr.Yan
 * @create: 2021-06-22 11:06
 **/
public class DateTimeTest {

    //1. System类中currentTimeMillis()
    @Test
    public void test1(){

        //时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    //java.util.Date类
    //toString():显示当前的年、月、日、时、分、秒
    //getTime(): 获取当前Date对象对应的毫秒数（时间戳）
    @Test
    public void test2(){
        Date date1 = new Date();
        System.out.println(date1.toString());//Tue Jun 22 11:34:37 CST 2021
        System.out.println(date1.getTime());


        Date date2 = new Date(1624331873219L);
        System.out.println(date2.toString());//Tue Jun 22 11:34:37 CST 2021
    }

    //java.sql.Date类
    @Test
    public void test3(){
        java.sql.Date date1 = new java.sql.Date(1624331873219L);
        System.out.println(date1.toString());//2021-06-22
        System.out.println(date1.getTime());

        //将java.util.Date转换为java.sql.Date对象
        //情况一：多态
        Date date2 = new java.sql.Date(1624332877865l);
        java.sql.Date date3 = (java.sql.Date)date2;
        System.out.println(date3.toString());//2021-06-22

        //情况二：通过毫秒数转换
        Date date4 = new Date();
        java.sql.Date date5 = new java.sql.Date(date4.getTime());
        System.out.println(date5.toString());//2021-06-22

    }
}
