package cn.zy.java.exer1;

import org.junit.Test;

import java.io.*;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-07 14:25
 **/
public class FileReaderWirterTest {

    //将day26下的file1.txt文件内容读入程序中，并输出到控制台
    @Test
    public void test1() {
        FileReader fileReader = null;
        try {
            //1. 实例化File类的对象，指明要操作的文件
            File file = new File("file1.txt");//相对于当前Moudle

            //2. 提供具体的流
            fileReader = new FileReader(file);

            //3. 数据的读入
            //read()：返回读入的一个字符。如果达到文件末尾，返回-1
            int read ;
            while((read = fileReader.read()) != -1){
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流的关闭操作
            try {
                if(fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    //对read()操作升级：使用read的重载方法
    @Test
    public void test2() {
        FileReader fileReader = null;

        try {
            //1. File类的实例化
            File file = new File("file1.txt");

            //2. 流的实例化
            fileReader = new FileReader(file);

            //3. 读入操作
            //read(char[] cbuf)：返回每次读入cbuf数组中的字符的个数。如果达到文件末尾，返回-1
            char[] cbuf = new char[5];
            int read ;
            while((read = fileReader.read(cbuf)) != -1){
                //不能使用cbuf.length()，每次读取只是替换数组元素，不是清空数组，文件末尾易出问题
                for(int i = 0; i < read; i++){
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader == null) {
                //4. 资源的关闭
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //从内存写出数据到硬盘的文件中
    @Test
    public void test3() {
        FileWriter fileWriter = null;
        try {
            //1. 提供File类的对象，指明写出到的文件
            File file = new File("file2.txt");

            //2. 提供FileWriter的对象，用于数据的写出
            fileWriter = new FileWriter(file, true);

            //3. 写出的具体操作
            fileWriter.write("I have a dream\n");
            fileWriter.write("you should have a dream too");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           if(fileWriter != null){
               //4. 流资源的关闭
               try {
                   fileWriter.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        }

    }



    //文件复制
    //不能使用字符流处理字节文件
    @Test
    public void test4(){
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //1. 创建File类的对象，指明读入和写出的文件
            File file1 = new File("file1.txt");
            File file3 = new File("file3.txt");

            //2. 创建输入流和输出流的对象
            fileReader = new FileReader(file1);
            fileWriter = new FileWriter(file3, true);

            //3. 数据的读入和写出操作
            char[] cbuf = new char[5];
            int read;
            while((read = fileReader.read(cbuf)) != -1){
                String str = new String(cbuf, 0, read);
                fileWriter.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void FileInputOutputStreamTest()  {
        FileInputStream fileInputStream = null;

        try {
            //1. 创建File类的对象
            File file = new File("file1.txt");

            //2. 创建流的对象
            fileInputStream = new FileInputStream(file);

            //3. 读取数据
            byte[] cbuf = new byte[3];
            int read;//每次读取的字节个数
            while((read = fileInputStream.read(cbuf)) != -1){
                String str = new String(cbuf, 0, read);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流资源的关闭
            if (fileInputStream == null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



    //复制图片
    @Test
    public void test5() {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;

        try {
            //1. 创建File类的对象
            File file1 = new File("1.jpg");
            File file2 = new File("2.jpg");

            //2. 创建FileInputStream对象，FileOutputStream对象
            fileOutputStream = new FileOutputStream(file2);
            fileInputStream = new FileInputStream(file1);

            //3. 文件复制操作
            byte[] bbuf = new byte[5];
            int read;
            while((read = fileInputStream.read(bbuf)) != -1){
                fileOutputStream.write(bbuf, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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

    public void copy(String scrPath, String destPath){
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;

        try {
            //1. 创建File类的对象
            File file1 = new File(scrPath);
            File file2 = new File(destPath);

            //2. 创建FileInputStream对象，FileOutputStream对象
            fileOutputStream = new FileOutputStream(file2);
            fileInputStream = new FileInputStream(file1);

            //3. 文件复制操作
            byte[] bbuf = new byte[1024];
            int read;
            while((read = fileInputStream.read(bbuf)) != -1){
                fileOutputStream.write(bbuf, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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

    @Test
    public void copyFileTest(){
        long start = System.currentTimeMillis();
        String scrPath = "C:\\Users\\Ricardo.Y\\Desktop\\01.mp4";
        String destPath = "C:\\Users\\Ricardo.Y\\Desktop\\02.mp4";
        copy(scrPath, destPath);

        long end = System.currentTimeMillis();

        System.out.println("copy花费时间：" + (end - start));//1789
    }
}
