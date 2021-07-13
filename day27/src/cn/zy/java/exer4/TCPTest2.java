package cn.zy.java.exer4;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;

/**
 * @program: code
 * @description: TCP编程；客户端发送文件给服务端，服务端将文件保存在本地
 * @author: Mr.Yan
 * @create: 2021-07-13 10:37
 **/
public class TCPTest2 {

    //客户端
    @Test
    public void client(){
        Socket socket = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            //1. 创建Socket对象，指明服务器端的ip和端口号
            InetAddress byName = InetAddress.getByName("127.0.0.1");
            socket = new Socket(byName, 8899);

            //2. 获取一个输出流，创建一个缓冲流用于输入
            outputStream = socket.getOutputStream();
            bufferedInputStream = new BufferedInputStream(new FileInputStream("exer4-1.txt"));

            //3. 读取文件，写出数据
            byte[] buff = new byte[20];
            int len;
            while((len = bufferedInputStream.read(buff)) != -1){
                outputStream.write(buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 资源的关闭
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

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
    public void server(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1. 创建ServerSocket，指明自己的端口号
            serverSocket = new ServerSocket(8899);
            //2. accept()接收来自客户端的Socket
            socket = serverSocket.accept();

            //3. 获取输入流，创建缓冲流用于输出
            inputStream = socket.getInputStream();
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("exer4-2.txt"));

            //4. 读取输入流的数据并写出到文件
            byte[] buff = new byte[20];
            int len;
            while((len = inputStream.read(buff)) != -1){
                bufferedOutputStream.write(buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流资源的关闭
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
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
            if (socket != null) {
                try {
                    socket.close();
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
