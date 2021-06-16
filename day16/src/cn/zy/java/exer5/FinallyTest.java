package cn.zy.java.exer5;

import org.junit.Test;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-08 15:09
 **/
public class FinallyTest {
    @Test
    public void test1(){

        int a = 10;
        int b = 0;
        try{
            System.out.println(a / b);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("乌鸦坐飞机");
        }
    }
}
