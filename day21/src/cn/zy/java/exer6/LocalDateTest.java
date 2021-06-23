package cn.zy.java.exer6;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @program: code
 * @description: LocalDate类
 * @author: Mr.Yan
 * @create: 2021-06-23 11:17
 **/
public class LocalDateTest {
    @Test
    public void test(){

        //调用静态方法now()实例化：获取当前日期，时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //调用静态方法of()：设置指定的年、月、日、时、分、秒
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 7, 18, 13, 23);
        System.out.println(localDateTime1);
    }



    @Test
    public void test1(){

        LocalDateTime localDateTime = LocalDateTime.now();

        //getXxx()：获取相关的属性
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());
    }

    @Test
    public void test2(){

        LocalDateTime localDateTime = LocalDateTime.now();

        //withXxx()：设置相关的属性
        LocalDateTime localDateTime1 = localDateTime.withDayOfMonth(1);

        System.out.println(localDateTime);//2021-06-23T13:56:12.784164100，不可变性
        System.out.println(localDateTime1);//2021-06-01T13:56:12.784164100

        LocalDateTime localDateTime2 = localDateTime.withYear(2020);
        System.out.println(localDateTime2);//2020-06-23T13:58:39.715663200
    }



    @Test
    public void test3(){

        LocalDateTime localDateTime = LocalDateTime.now();

        //plusXxx()：相关属性加法
        LocalDateTime localDateTime1 = localDateTime.plusMonths(1);

        System.out.println(localDateTime);//2021-06-23T14:06:45.985218800
        System.out.println(localDateTime1);//2021-07-23T14:06:45.985218800

        //minusXxx()：相关属性减法
        LocalDateTime localDateTime2 = localDateTime.minusDays(3);
        System.out.println(localDateTime2);//2021-06-20T14:06:45.985218800
    }
}
