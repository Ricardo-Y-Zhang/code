package cn.zy.java.exer3;

import org.junit.Test;

import java.io.*;

/**
 * @program: code
 * @description: 缓冲流练习
 * @author: Mr.Yan
 * @create: 2021-07-10 14:00
 **/
public class test1 {

    @Test
    public void test(){
        long start1 = System.currentTimeMillis();
        //使用节点流实现文件的复制
        String srcPath = "C:\\Users\\Ricardo.Y\\Desktop\\01.mp4";
        String destPath = "C:\\Users\\Ricardo.Y\\Desktop\\02.mp4";

        copy1(srcPath, destPath);
        long end1 = System.currentTimeMillis();
        System.out.println("节点流复制时间：" + (end1 - start1));

        long start2 = System.currentTimeMillis();
        //使用缓冲流实现文件的复制
        copy2(srcPath, destPath);
        long end2 = System.currentTimeMillis();
        System.out.println("节点流复制时间：" + (end2 - start2));
    }


    //节点流：FileInputStream，FileOutputStream复制
    public void copy1(String srcPath, String destPath){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1. 创建File类的对象
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //2. 创建FileInputStream, FileOutputStream节点流
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);

            //3. 文件复制
            byte[] buff = new byte[1024];
            int read;
            while((read = fileInputStream.read(buff)) != -1){
                fileOutputStream.write(buff, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭流资源
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //BufferedInputStream, BufferedOutputStream缓冲流复制
    public void copy2(String srcPath, String destPath){
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1. 创建File类对象
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //2. 创建BufferedInputStream, BufferedOutputStream缓冲流
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);

            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);


            //3. 复制操作
            byte[] buff = new byte[1024];
            int read;
            while((read = bufferedInputStream.read(buff)) != -1){
                bufferedOutputStream.write(buff, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭流资源
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
        }

}
