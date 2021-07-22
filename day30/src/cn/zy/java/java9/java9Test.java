package cn.zy.java.java9;

import org.junit.Test;

import java.io.*;
import java.util.*;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-22 09:52
 **/
public class java9Test {

    //钻石操作符的升级
    @Test
    public void test1(){

        //钻石操作符和匿名实现类在Java9中可以共存
        Comparator<Object> comparator = new Comparator<>() {
            @Override
            public int compare(Object o, Object t1) {
                return 0;
            }
        };
    }


    //单元测试中无法使用System.in,Scanner
    //try操作的升级：java8中资源的自动关闭，写在（）内
    @Test
    public void test2() {
        try (InputStreamReader reader = new InputStreamReader(System.in)) {
            char[] buff = new char[20];
            int len = 0;
            if ((len = reader.read(buff)) != -1) {
                String s = new String(buff, 0, len);

                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    //java 9中资源的自动关闭：需要自动关闭的资源的实例化可以放在（）外
    @Test
    public void test3() {
        InputStreamReader reader = new InputStreamReader(System.in);
        try (reader) {
            char[] buff = new char[20];
            int len = 0;
            if ((len = reader.read(buff)) != -1) {
                String s = new String(buff, 0, len);

                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //集合工厂方法：创建只读集合
    @Test
    public void test4(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ricardo");
        list.add("徐凤年");
        list.add("李淳罡");
        list.add("王仙芝");
        //修改为只读集合
        List<String> list1 = Collections.unmodifiableList(list);
        //不能添加，报错
        //list1.add("123");
        System.out.println(list1);
    }




    @Test
    public void test5(){

        //返回值为Arrays内定义的内部类ArrayList；也是只读集合
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        //不能添加，报错
        //list.add(5);
    }




    //java 9中：创建只读集合-of()
    @Test
    public void test6(){
        List<Integer> list = List.of(1, 2, 3, 4);
        //不能添加，报错
        //list.add(5);

        Set<Integer> set = Set.of(1, 3, 4, 5, 6);

        Map<String, Integer> map = Map.of("tom", 18, "judy", 23);
    }


    //java 9中：InputStream的新方法：transferTo()
    @Test
    public void test7(){

        try(FileInputStream fileInputStream = new FileInputStream("hello.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("hello1.txt")){
            fileInputStream.transferTo(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
