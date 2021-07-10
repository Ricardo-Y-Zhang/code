package cn.zy.java.exer5;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @program: code
 * @description:标准的输入输出流
 * @author: Mr.Yan
 * @create: 2021-07-10 20:31
 **/
public class OtherStreamTest {


    //单元测试中不支持
    //System.in(InputStream)——>转换流——>BufferedReader的readLine()
    @Test
    public void test(){
        BufferedReader bufferedReader = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);

            while (true){
                System.out.print("请输入字符串:");
                String data = bufferedReader.readLine();
                if("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)){
                    System.out.println("程序结束");
                    break;
                }

                System.out.println(data.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
