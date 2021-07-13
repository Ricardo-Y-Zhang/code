package cn.zy.java.exer5;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @program: code
 * @description:UDP协议的网络编程
 * @author: Mr.Yan
 * @create: 2021-07-13 14:12
 **/
public class UDPTest {

    //发送端
    @Test
    public void send(){

        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
            String str = "Rocket起飞了";
            byte[] data = str.getBytes();
            DatagramPacket packet = new DatagramPacket(data, 0, data.length, InetAddress.getByName("127.0.0.1"), 9090);
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }

    //接收端
    @Test
    public void receiver(){

        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(9090);

            byte[] buffer = new byte[100];
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);

            socket.receive(packet);

            String s = new String(packet.getData(), 0, packet.getLength());
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}
