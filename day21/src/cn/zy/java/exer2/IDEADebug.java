package cn.zy.java.exer2;

import org.junit.Test;

/**
 * @program: code
 * @description: idea中debug
 * @author: Mr.Yan
 * @create: 2021-06-22 17:24
 **/
public class IDEADebug {

    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);

        System.out.println(stringBuffer.length());

        System.out.println(stringBuffer);//"null"

        StringBuffer stringBuffer1 = new StringBuffer(str);
        System.out.println(stringBuffer1);
    }
}
