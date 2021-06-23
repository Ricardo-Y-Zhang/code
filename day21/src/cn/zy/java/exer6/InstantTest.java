package cn.zy.java.exer6;

import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-23 14:18
 **/
public class InstantTest {

    @Test
    public void test1(){

        //时间：2021-06-23T14:30:39.359176400+08:00

        //now(): 获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2021-06-23T06:30:39.359176400Z

        //添加时间偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2021-06-23T14:30:39.359176400+08:00


        //获取瞬时对应的毫秒数
        System.out.println(instant.toEpochMilli());

        //通过给定的毫秒数获取instant实例
        Instant instant1 = Instant.ofEpochMilli(1624429910255l);
        System.out.println(instant1);
    }
}
