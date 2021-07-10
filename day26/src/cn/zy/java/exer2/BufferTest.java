package cn.zy.java.exer2;

import org.junit.Test;

import java.io.*;

/**
 * @program: code
 * @description: 缓冲流的使用
 * @author: Mr.Yan
 * @create: 2021-07-09 13:36
 **/
public class BufferTest {

    //缓冲流复制非文本文件
    @Test
    public void BufferedStreamTest(){
        long start = System.currentTimeMillis();
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            //1. 创建File类实例
            File file1 = new File("C:\\Users\\Ricardo.Y\\Desktop\\01.mp4");
            File file2 = new File("C:\\Users\\Ricardo.Y\\Desktop\\02.mp4");


            //2. 创建BufferedInputStream，BufferedOutputStream类实例
            //2.1 创建FileInputStream, FileOutputStream节点流（文件流）
            fileInputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream(file2);
            //2.2 创建BufferedInputStream, BufferedOutputStream缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //3. 文件复制
            byte[] buff = new byte[1024];
            int read;
            while((read = bufferedInputStream.read(buff)) != -1){
                bufferedOutputStream.write(buff, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流的关闭
            //先关闭外层流，再关闭内层的流;关闭外层流的同时，内层流也会自动的进行关闭。内层流的关闭可以省略
            if(bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(bufferedOutputStream != null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        long end = System.currentTimeMillis();
        System.out.println("花费时间：" + (end - start));//408
    }



    //缓冲字符流复制文本文件
    public void copy(String srcPath, String destPath) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            //1. 创建File类的对象
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //2.1 创建FileReader，FileWriter节点流
            FileReader reader = new FileReader(srcFile);
            FileWriter writer = new FileWriter(destFile);
            //2.2 创建BufferReader, BufferWirter缓冲流
            bufferedReader = new BufferedReader(reader);
            bufferedWriter = new BufferedWriter(writer);


            //3. 复制操作
            char[] cbuf = new char[1024];
            int read;
            while((read = bufferedReader.read(cbuf)) != -1){
                bufferedWriter.write(cbuf, 0, read);
            }

            //readLine()：读取一行字符
//            String data;
//            while((data = bufferedReader.readLine()) != null){
//                bufferedWriter.write(data + "\n");//不包含换行符
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流资源关闭
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


}
