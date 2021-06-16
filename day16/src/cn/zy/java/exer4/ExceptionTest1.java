package cn.zy.java.exer4;

import org.junit.Test;

/**
 * @program: code
 * @description: 异常处理
 * @author: Mr.Yan
 * @create: 2021-06-08 14:18
 **/
public class ExceptionTest1 {

    @Test
    public void test1(){

        String str = "123";
        try{
            str = "abc";
            int num = Integer.parseInt(str);
            System.out.println("hello1");
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("hello2");

        System.out.println(str);

    }
}
