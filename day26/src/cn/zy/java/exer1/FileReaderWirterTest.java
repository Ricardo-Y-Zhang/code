package cn.zy.java.exer1;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
}
