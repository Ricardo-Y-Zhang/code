package cn.zy.java.exer2;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-12 11:30
 **/
public class RandomAccessFileTest {
    @Test
    public void test1(){

        RandomAccessFile r = null;
        RandomAccessFile rw = null;
        try {
            r = new RandomAccessFile("1.jpg", "r");
            rw = new RandomAccessFile("2.jpg", "rw");

            byte[] buffer = new byte[1024];
            int read;
            while((read = r.read(buffer)) != -1){
                rw.write(buffer, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (rw != null) {
                try {
                    rw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2(){
        RandomAccessFile rw = null;
        try {
            rw = new RandomAccessFile("h.txt", "rw");

            rw.seek(3);

            rw.write("xyz".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (rw != null) {
                try {
                    rw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    //使用RandomAccessFile实现数据的插入效果
    @Test
    public void test3(){
        RandomAccessFile rw = null;
        try {
            rw = new RandomAccessFile("h.txt", "rw");

            rw.seek(3);//将指针调到角标为3的位置
            //保存指针3后面的所有数据到StringBuilder中，指定容量为(int)File.length()
            StringBuilder builder = new StringBuilder((int) new File("h.txt").length());
            byte[] buffer = new byte[20];
            int read;
            while((read = rw.read(buffer)) != -1){
                builder.append(new String(buffer, 0, read));
            }

            //调回指针，写入"xyz"
            rw.seek(3);
            rw.write("xyz".getBytes());

            //将StringBuilder中的数据写入文件中
            rw.write(builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(rw != null){
                try {
                    rw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
