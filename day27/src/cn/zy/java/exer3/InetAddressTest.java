package cn.zy.java.exer3;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-12 15:59
 **/
public class InetAddressTest {

    @Test
    public void test1() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("192.162.10.14");
        System.out.println(inetAddress);

        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);//www.baidu.com/180.101.49.11

        //本机IP
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //getHostName()
        System.out.println(inetAddress.getHostName());


        //getHostAddress()
        System.out.println(inetAddress.getHostAddress());//192.162.10.14
    }
}
