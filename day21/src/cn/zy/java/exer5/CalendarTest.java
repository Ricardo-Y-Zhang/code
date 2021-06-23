package cn.zy.java.exer5;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: code
 * @description: 日历类的使用
 * @author: Mr.Yan
 * @create: 2021-06-23 09:44
 **/
public class CalendarTest {


    @Test
    public void test1(){
        //抽象类实例化
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());//class java.util.GregorianCalendar

        //常用方法
        //get()
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set()
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //add()
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //getTime()：日历类——>Date
        Date time = calendar.getTime();
        System.out.println(time);

        //setTime()：Date ——> 日历类
        Date date = new Date();
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }



    //计算2021--03-04 到 2021-06-23一共多少天
    @Test
    public void test2() throws ParseException {
        //字符串转Date类
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date parse1 = simpleDateFormat.parse("2021-03-04");
        Date parse2 = simpleDateFormat.parse("2021-06-23");


        //Date类转Calendar类
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse1);
        //是一年中的第几天
        int day1 = calendar.get(Calendar.DAY_OF_YEAR);
        calendar.setTime(parse2);
        int day2 = calendar.get(Calendar.DAY_OF_YEAR);

        int mins = day2 - day1;

        System.out.println("2021-6-23与2021-03-04相差" + mins + "天");
    }



}
