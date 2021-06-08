package src.cn.zy.java.exer3;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: code
 * @description: 异常测试
 * @author: Mr.Yan
 * @create: 2021-06-07 16:50
 **/
public class ExceptionTest {

    //NullPointerException
    @Test
    public void test1(){
        int[] arr = null;

        System.out.println(arr[2]);
    }


    //ArrayIndexOutOfBoundsException
    @Test
    public void test2(){
        int[] arr = new int[2];

        System.out.println(arr[3]);
    }


    //ClassCastException(类型转换异常)
    @Test
    public void test3(){

        Object obj = new Date();

        String str = (String) obj;
    }


    //NumberFormatException
    @Test
    public void test4(){

        int in1 = Integer.parseInt("abc");

    }


    //InputMismatchException
    //IDEA中无法使用Unit测试Scanner
    @Test
    public void test5(){

        Scanner scan = new Scanner(System.in);

        int in1 = scan.nextInt();

        System.out.println(in1);

        scan.close();
    }


    //ArithmeticException
    @Test
    public void test6(){

        int i = 0;
        System.out.println(6/i);
    }



//    //编译时异常
//    @Test
//    public void test7(){
//        File file = new File("hello.txt");
//        FileInputStream fis = new FileInputStream(file);
//
//        int data = fis.read();
//
//        while(data != -1){
//            System.out.println(data);
//        }
//
//        fis.close();
//    }
}

