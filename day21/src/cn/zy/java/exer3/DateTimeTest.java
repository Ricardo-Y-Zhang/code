package cn.zy.java.exer3;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-22 19:16
 **/
public class DateTimeTest {

    //SimpleDateFormat的使用：对日期Date类的格式化和解析
    @Test
    public void test1() throws ParseException {
        //实例化simpleDateFormat：使用默认的构造器，不常用
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);//Tue Jun 22 19:21:37 CST 2021

        //格式化：日期——>字符串
        String format = simpleDateFormat.format(date);
        System.out.println(format);//2021/6/22 下午7:21

        //解析：字符串——>日期，要求字符串符合simpleDateFormat识别的格式，由构造器的参数决定
        String str = "2021/6/22 下午7:21";
        Date parse = simpleDateFormat.parse(str);
        System.out.println(parse);//Tue Jun 22 19:21:00 CST 2021


        //按指定方式格式化和解析：调用带参数的构造器
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);
    }


    //字符串"2020-09-08"转换为java.sql.Date
    @Test
    public void test2() throws ParseException {
        //实例化simpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date parse = simpleDateFormat.parse("2020-09-08");

        //java.util.Date 转换为 java.sql.Date
        java.sql.Date date = new java.sql.Date(parse.getTime());
        System.out.println(date);
    }
}
