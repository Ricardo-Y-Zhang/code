package cn.zy.java.exer5;

import org.junit.Test;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-22 09:19
 **/
public class StringBufferTest {
    @Test
    public void test1(){
        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.setCharAt(0, 'b');
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());

        StringBuffer stringBuffer1 = new StringBuffer();
        System.out.println(stringBuffer1.length());

    }

    @Test
    public void test2(){
        long startTime = 0l;
        long endTime = 0l;
        String text = "";
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuilder stringBuilder = new StringBuilder("");

        startTime  = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }


    @Test
    public void test3(){
        String str = new String("abc");

        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuilder stringBuilder = new StringBuilder(str);

        String str1 = new String(stringBuffer);
        String str2 = new String(stringBuilder);

        String str3 = stringBuffer.toString();
        String str4 = stringBuilder.toString();
    }
}
