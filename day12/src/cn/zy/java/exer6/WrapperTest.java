package src.cn.zy.java.exer6;

import org.junit.Test;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-01 14:50
 **/
public class WrapperTest {


    //基本数据类型 ——> 包装类：调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;

        Integer in1 = new Integer(num1);

        Integer in2 = new Integer("123");

        System.out.println(in1.toString());

        System.out.println(in2.toString());

        Float f1 = new Float("12.3");
        System.out.println(f1.toString());
    }


    //包装类 ——> 基本数据类型：调用包装类的xxxValue（）方法
    @Test
    public void test2(){
        Integer in1 = new Integer(12);

        int i1 = in1.intValue();

        System.out.println(i1);

        Float fl1 = new Float(12.3);

        float f1 = fl1.floatValue();

        System.out.println(f1 + 0.1);
    }


    //自动装箱、自动开箱
    @Test
    public void test3(){
        int num1 = 13;

        method(num1);

        //自动装箱：
        int num2 = 10;
        Integer in1 = num2;

        boolean b1 = true;
        Boolean b2 = b1;

        //自动拆箱：
        int num3 = in1;
    }

    public void method(Object obj){
        System.out.println(obj);
    }



    //基本数据类型、包装类 ——> String类型：调用String重载的valueOf（）
    @Test
    public void test4(){
        int num1 = 10;

        //方式1：连接运算
        String str1 = num1 + "";

        //方式2：调用String的valueOf()
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);

        System.out.println(str2);
        System.out.println(str3);
    }


    //String类型 ——> 基本数据类型、包装类：调用包装类的parseXxx（String s）
    @Test
    public void test5(){

        String str1 = "123";

        int num1 = Integer.parseInt(str1);

        System.out.println(num1 + 1);

        String str2 = "12.3";

        float f1 = Float.parseFloat(str2);

        System.out.println(f1 + 0.1);

        String str3 = "false";

        boolean b1 = Boolean.parseBoolean(str3);

        if(b1 == false){
            System.out.println("parseBoolean(str3)");
        }
    }


    //包装类面试题
    @Test
    public void test6(){
        //三元运算符同一类型
        Object obj = true ? new Integer(1) : new Double(2.0);

        System.out.println(obj);
    }

    @Test
    public void test7(){
        Integer in1 = new Integer(1);
        Integer in2 = new Integer(1);
        System.out.println(in1 == in2);


        //Integer内部定义了IntegerCache结构，定义了Integer[]
        //保存了 -128 ~ 127 范围的整数。
        // 如果使用自动装箱的方式，给Integer赋值的范围在此范围内，可以直接使用数组中的元素，不用再去new，提高效率
        Integer in3 = 1;
        Integer in4 = 1;
        System.out.println(in3 ==  in4);


        Integer in5 = 128;
        Integer in6 = 128;
        System.out.println(in5 == in6);
    }
}
