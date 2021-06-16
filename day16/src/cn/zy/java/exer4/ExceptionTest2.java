package cn.zy.java.exer4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-08 16:21
 **/
public class ExceptionTest2 {

    public static void main(String[] args) {

        try{
            method2();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void method2() throws FileNotFoundException, IOException{
        method1();
    }

    public static void method1() throws FileNotFoundException, IOException{
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();

        while(data != -1){
            System.out.println(data);
        }

        fis.close();
    }
}
