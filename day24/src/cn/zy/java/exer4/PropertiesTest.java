package cn.zy.java.exer4;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @program: code
 * @description: properties
 * @author: Mr.Yan
 * @create: 2021-07-05 14:12
 **/
public class PropertiesTest {

    //Properties:常用来处理配置文件，key和value都是String类型
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
        properties.load(fileInputStream);//加载流对应的文件

        String name = properties.getProperty("name");
        String password = properties.getProperty("password");

        System.out.println("name = " + name);
        System.out.println("password = " + password);

        fileInputStream.close();
    }
}
