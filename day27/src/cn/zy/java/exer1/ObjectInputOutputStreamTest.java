package cn.zy.java.exer1;

import org.junit.Test;
import org.junit.runner.notification.RunListener;

import java.io.*;

/**
 * @program: code
 * @description: 对象流的使用
 * @author: Mr.Yan
 * @create: 2021-07-12 10:01
 **/
public class ObjectInputOutputStreamTest {

    //序列化
    @Test
    public void objectOutputStreamTest(){
        ObjectOutputStream objectOutputStream = null;

        try {
            //1. 创建File类对象，对象输出流
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("file1.data"));

            //2. 写入操作
            objectOutputStream.writeObject(new String("武汉加油"));

            objectOutputStream.flush();//刷新操作
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                //3. 流资源的关闭
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    //反序列化
    @Test
    public void objectInputStreamTest(){

        ObjectInputStream objectInputStream = null;
        try {
            //1. 创建File类对象，对象输入流
            objectInputStream = new ObjectInputStream(new FileInputStream("file1.data"));

            //2. 读入操作
            Object o = objectInputStream.readObject();
            String str = (String) o;
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //3. 流资源的关闭
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



    @Test
    public void test1(){

        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("file2.data"));
            objectInputStream = new ObjectInputStream(new FileInputStream("file2.data"));

            objectOutputStream.writeObject(new Person("徐凤年", 18));
            objectOutputStream.flush();//刷新操作
            Object o = objectInputStream.readObject();

            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
