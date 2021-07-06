package cn.zy.java.exer6;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @program: code
 * @description: File类的使用
 * @author: Mr.Yan
 * @create: 2021-07-06 16:46
 **/
public class FileTest {


    @Test
    public void test1(){

        //构造器一
        File file1 = new File("file1.txt");//相对于当前module
        File file2 = new File("C:\\Users\\Ricardo.Y\\Desktop\\code\\code\\day25\\src\\cn\\zy\\java\\exer6\\file2.txt");

        //调用separator，动态的提供分隔符
//        File file2 = new File("C:" + File.separator + "Users" + File.separator + "Ricardo.Y" + File.separator
//                + "Desktop" + File.separator + "code" + File.separator + "code" + File.separator + "day25" + File.separator
//                + "src" + File.separator + "cn" + File.separator + "zy" + File.separator + "java" + File.separator
//                + "exer6" + File.separator + "file2.txt");


        //构造器二
        File file3 = new File("C:\\Users\\Ricardo.Y\\Desktop", "code");
        System.out.println(file3);//C:\Users\Ricardo.Y\Desktop\code


        //构造器三
        File file4 = new File(file3, "file4.txt");
        System.out.println(file4);//C:\Users\Ricardo.Y\Desktop\code\file4.txt

    }

    @Test
    public void test2(){
        File file1 = new File("file1.txt");
        System.out.println("file1.getAbsolutePath() = " + file1.getAbsolutePath());//file1.getAbsolutePath() = C:\Users\Ricardo.Y\Desktop\code\code\day25\file1.txt
        System.out.println("file1.getName() = " + file1.getName());//file1.getName() = file1.txt
        System.out.println("file1.getPath() = " + file1.getPath());//file1.getPath() = file1.txt
        System.out.println("file1.getParent() = " + file1.getParent());//file1.getParent() = null
        System.out.println("file1.length() = " + file1.length());//file1.length() = 5
        System.out.println(new Date(file1.lastModified()));//Tue Jul 06 17:38:56 CST 2021
    }


    @Test
    public void test3(){
        File file = new File("C:\\Users\\Ricardo.Y\\Desktop\\code\\code");

        //String数组
        String[] list = file.list();
        for(String s : list){
            System.out.println(s);
        }

        //File数组
        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f);
        }
    }


    @Test
    public void test4(){
        File file = new File("file1.txt");
        System.out.println("file.isFile() = " + file.isFile());//true
        System.out.println("file.isDirectory() = " + file.isDirectory());//false
        System.out.println("file.exists() = " + file.exists());//true
        System.out.println("file.canRead() = " + file.canRead());//true
        System.out.println("file.canWrite() = " + file.canWrite());//true
        System.out.println("file.isHidden() = " + file.isHidden());//false
    }

    @Test
    public void test5() throws IOException {
        File file = new File("file2.txt");
        if(!file.exists()){
            //文件创建
            file.createNewFile();
            System.out.println("创建成功");
        }else{
            //文件删除
            file.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test6(){
        //文件目录创建
        File file = new File("io");
        boolean mkdir = file.mkdir();
    }
}
