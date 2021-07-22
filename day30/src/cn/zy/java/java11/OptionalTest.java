package cn.zy.java.java11;

import org.junit.Test;

import java.util.Optional;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-22 15:46
 **/
public class OptionalTest {

    //java 11 新特性：Optional加强
    @Test
    public void test(){

        Optional<Object> empty = Optional.empty();
        //isPresent()：判断内部的value是否存在
        System.out.println(empty.isPresent());//false
        //isEmpty()：判断内部的value是否为空
        System.out.println(empty.isEmpty());//true

        //orElseThrow()：value非空，返回value，否则抛异常
        var obj = empty.orElseThrow();

    }
}
