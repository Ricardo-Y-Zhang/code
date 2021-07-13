package cn.zy.java.exer4;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: code
 * @description: TCP编程；从客户端发送文件给客户端，服务端保存到本地，并返回“发送成功”给客户端
 * @author: Mr.Yan
 * @create: 2021-07-13 11:10
 **/
public class TCPTest3 {

    @Test
    public void client(){
        Socket socket = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        InputStream inputStream = null;
        try {
            //1. 创建Socket对象，指明服务端的ip和端口号
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress, 9090);

            //2. 获取Socket的输出流输出流，创建缓冲流读取文件
            outputStream = socket.getOutputStream();
            inputStream = socket.getInputStream();
            bufferedInputStream = new BufferedInputStream(new FileInputStream("exer4-3.txt"));

            //3. 缓冲流读取文件，写出数据
            byte[] buff = new byte[1024];
            int len;
            while((len = bufferedInputStream.read(buff)) != -1){
                outputStream.write(buff, 0, len);
            }
            //关闭数据的输出
            socket.shutdownOutput();

            //4. 接收服务端的反馈
            byteArrayOutputStream = new ByteArrayOutputStream();
            while((len = inputStream.read(buff)) != -1){
                byteArrayOutputStream.write(buff, 0, len);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5. 流资源的关闭
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
            if (inputStream != null) {
                try {
                    inputStream.close();
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
        OutputStream outputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1. 创建ServerSocket，指明端口号
            serverSocket = new ServerSocket(9090);

            //2. 接收客户端的Socket
            socket = serverSocket.accept();

            //3. 获取socket的输入流输出流，缓冲流用于写出文件
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("exer4-4.txt"));

            //4. 读取输入流的数据并写出到文件
            byte[] buff = new byte[1024];
            int len;
            while ((len = inputStream.read(buff)) != -1){
                bufferedOutputStream.write(buff, 0, len);
            }
            //5. 服务器端给客户端反馈
            outputStream.write("发送成功".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6. 流资源的关闭
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
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
