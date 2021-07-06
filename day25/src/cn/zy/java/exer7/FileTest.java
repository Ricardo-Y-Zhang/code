package cn.zy.java.exer7;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @program: code
 * @description: 练习
 * @author: Mr.Yan
 * @create: 2021-07-06 20:01
 **/
public class FileTest {
    @Test
    public void test1() throws IOException {
        File file = new File("C:\\Users\\Ricardo.Y\\Desktop\\file");
        if(!file.exists()){
            file.mkdir();
        }
        File file1 = new File(file, "file1.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }
        File file2 = new File(file,"file2");
        if(!file2.exists()){
            file2.mkdir();
        }
        File file3 = new File(file2.getParent(), "file3.txt");
        if(!file3.exists()){
            file3.createNewFile();
        }

        //deleteFile(file1);

        haveJpg(file);
    }


    //删除file中指定文件
    public void deleteFile(File file){
        //判断是否存在且为文件
        if(file.exists()&&file.isFile()){
            file.delete();
        }
    }

    //判断指定目录下是否有后缀名为.jpg的文件，有，输出文件名称
    public void haveJpg(File file){
        String[] list = file.list();

//        for (int i = 0; i < list.length; i++) {
//            String str = list[i];
//            if(str.endsWith(".jpg")){
//                System.out.println(str);
//            }
//        }

        for(String str : list){
            if(str.endsWith(".jpg")){
                System.out.println(str);
            }
        }
    }
}
