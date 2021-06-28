package cn.zy.java.exer8;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @program: code
 * @description: System
 * @author: Mr.Yan
 * @create: 2021-06-28 17:11
 **/
public class ClassTest {


    @Test
    public void test1(){
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的version：" + javaVersion);//java的version：11.0.10

        String javaHome = System.getProperty("java.home");
        System.out.println("java的home：" + javaHome);//java的home：C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.3\jbr

        String osName = System.getProperty("os.name");
        System.out.println("操作系统名称：" + osName);//操作系统名称：Windows 10

        String osVersion = System.getProperty("os.version");
        System.out.println("操作系统版本：" + osVersion);//操作系统版本：10.0

        String userName = System.getProperty("user.name");
        System.out.println("用户的账户名称：" + userName);//用户的账户名称：Ricardo.Y

        String userHome = System.getProperty("user.home");
        System.out.println("用户的主目录：" + userHome);//用户的主目录：C:\Users\Ricardo.Y

        String userDir = System.getProperty("user.dir");
        System.out.println("用户的当前工作目录：" + userDir);//用户的当前工作目录：C:\Users\Ricardo.Y\Desktop\code\code\day21
    }


    @Test
    public void test2(){
        BigInteger bi = new BigInteger("12312312445594380203891274912973981279179213154656723");
        BigDecimal bd = new BigDecimal("81932.34");
        BigDecimal bd2 = new BigDecimal("231");

        System.out.println(bi);
  //      System.out.println(bd.divide(bd2));

        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
    }
}
