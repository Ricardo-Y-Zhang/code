package cn.zy.java.exer2;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: code
 * @description: 类的加载器
 * @author: Mr.Yan
 * @create: 2021-07-14 16:42
 **/
public class ClassLoaderTest {

    @Test
    public void test1(){
        //对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//jdk.internal.loader.ClassLoaders$AppClassLoader@1f89ab83

        //调用系统类加载器的getParent()：获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);//jdk.internal.loader.ClassLoaders$PlatformClassLoader@77f99a05

        //调用扩展器加载器的getParent()：无法获取引导类加载器
        //引导类加载器主要负责加载java的核心类库，无法加载自定义类
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);//null
    }

    //读取配置文件，方式一
    @Test
    public void test2() throws IOException {
        Properties properties = new Properties();
        //此时文件默认在当前module下
        FileInputStream fileInputStream = new FileInputStream("jdbc.properties");

        properties.load(fileInputStream);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        System.out.println("user = " + user + " ,password = " + password);
    }

    //方式二
    @Test
    public void test3() throws IOException {
        Properties properties = new Properties();
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();

        //配置文件默认识别为：当前module的src下
        InputStream inputStream = classLoader.getResourceAsStream("jdbc1.properties");

        properties.load(inputStream);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("user = " + user + ", password = " + password);
    }
}
