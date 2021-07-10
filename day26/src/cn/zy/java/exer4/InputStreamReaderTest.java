package cn.zy.java.exer4;

import org.junit.Test;

import java.io.*;

/**
 * @program: code
 * @description: 转换流的使用
 * @author: Mr.Yan
 * @create: 2021-07-10 16:04
 **/
public class InputStreamReaderTest {

    @Test
    public void test1(){
        InputStreamReader inputStreamReader = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("file1.txt");
            //InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);//使用系统默认的字符集
            //参数2指明了字符集，具体使用那个字符集，取决于文件file1.txt保存时使用的字符集
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            char[] cbuf = new char[20];
            int read;
            while((read = inputStreamReader.read(cbuf)) != -1){
                String str = new String(cbuf, 0, read);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void test2(){
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("file1.txt");//字节流
            FileOutputStream fileOutputStream = new FileOutputStream("file1_gbk.txt");

            inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, "gbk");

            char[] cbuf = new char[1024];
            int read;

            while((read = inputStreamReader.read(cbuf)) != -1){
                outputStreamWriter.write(cbuf, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStreamWriter != null) {
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
