package cn.zy.java.exer6;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-23 14:44
 **/
public class DateTimeFormatterTest {

    //预定义标准格式
    @Test
    public void test1(){
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        //格式化：日期——>字符串
        LocalDateTime now = LocalDateTime.now();
        String format = isoLocalDateTime.format(now);
        System.out.println(now);
        System.out.println(format);

        //解析：字符串——>日期
        TemporalAccessor parse = isoLocalDateTime.parse(format);
        System.out.println(parse);
    }

    //本地化相关格式
    @Test
    public void test2(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        LocalDateTime now = LocalDateTime.now();

        String format = dateTimeFormatter.format(now);
        System.out.println(format);//2021年6月23日 下午2:58:37
    }


    //重点：自定义的格式
    @Test
    public void test3(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        //格式化
        String format = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(format);

        //解析
        TemporalAccessor parse = dateTimeFormatter.parse("2020-09-08 04:00:00");
        System.out.println(parse);
    }
}
