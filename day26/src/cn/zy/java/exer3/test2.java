package cn.zy.java.exer3;

import org.junit.Test;

import java.io.*;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-10 14:41
 **/
public class test2 {
    //实现图片的加密
    //按位取异或
    @Test
    public void test(){
        String srcPath = "1.jpg";
        String tempPath = "temp.jpg";
        encrypted(srcPath, tempPath);

        //解密，再次取异或
        String destPath = "3.jpg";
        encrypted(tempPath, destPath);

    }

    public void encrypted(String srcPath, String tempPath){
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            //1. 创建File类对象
            File srcFile = new File(srcPath);
            File tempFile = new File(tempPath);


            //2. 创建BufferedInputStream, BufferedOutputStream类对象
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(tempFile);

            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //3. 加密操作
            int read;
            while((read = bufferedInputStream.read()) != -1){
                bufferedOutputStream.write(read ^ 5);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流资源关闭
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
