package cn.zy.java.exer4;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: code
 * @description: 实现TCP的网络编程；客户端发送信息给服务端，服务端将数据显示在控制台上
 * @author: Mr.Yan
 * @create: 2021-07-13 09:49
 **/
public class TCPTest1 {

    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            //1. 创建Socket对象，指明服务器端的ip和端口号
            //根据对方的IP获取InetAddress
            InetAddress byName = InetAddress.getByName("127.0.0.1");
            socket = new Socket(byName, 8899);

            //2. 获取一个输出流，用于输出数据
            outputStream = socket.getOutputStream();
            //3. 写出数据
            outputStream.write("你好我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 资源关闭
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //服务端
    @Test
    public void server() {

        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //1. 创建服务器端的ServerSocket，指明自己的端口号
            serverSocket = new ServerSocket(8899);

            //2. 调用accept()表示接收来自于客户端的Socket
            accept = serverSocket.accept();

            //3. 获取输入流
            inputStream = accept.getInputStream();

            //以字节流读取，可能有乱码；不推荐
//        byte[] buff = new byte[20];
//        int len;
//        while((len = inputStream.read(buff)) != -1){
//            String str = new String(buff, 0, len);
//            System.out.println(str);
//        }

            //4. 读取输入流的数据
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len;
            while((len = inputStream.read(buffer)) != -1){
                byteArrayOutputStream.write(buffer, 0, len);
            }

            System.out.println(byteArrayOutputStream.toString());

            System.out.println("收到来自于：" + accept.getInetAddress().getHostAddress() + "的数据");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5. 关闭资源
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
