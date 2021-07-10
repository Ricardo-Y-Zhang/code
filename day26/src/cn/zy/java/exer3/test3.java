package cn.zy.java.exer3;

import org.junit.Test;

import java.io.*;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @program: code
 * @description: 获取文件中每个字符出现的次数
 * @author: Mr.Yan
 * @create: 2021-07-10 14:57
 **/
public class test3 {

    @Test
    public void test(){
        String srcPath = "test3-1.txt";
        String destPath = "test3-2.txt";
        getTimes(srcPath, destPath);
    }

    public void getTimes(String srcPath, String destPath){
        File srcFile = new File(srcPath);
        File destFile = new File(destPath);

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(destFile);

            HashMap<Character, Integer> hashMap = new HashMap<>();
            int read;
            while((read = fileReader.read()) != -1){
                if( hashMap.containsKey((char)read)){//已存在
                    hashMap.put((char)read, hashMap.get((char)read)+1);
                }else{
                    hashMap.put((char)read, 1);
                }
            }

            //存放Map中数据
            Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
            Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
            while(iterator.hasNext()){
                fileWriter.write(iterator.next().toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流资源
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
