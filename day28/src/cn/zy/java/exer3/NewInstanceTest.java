package cn.zy.java.exer3;

import cn.zy.java.exer1.Person;
import org.junit.Test;

import java.time.Instant;
import java.util.Random;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-14 17:22
 **/
public class NewInstanceTest {

    @Test
    public void test1() throws IllegalAccessException, InstantiationException {

        Class<Person> aClass = Person.class;

        //newInstance()：调用此方法，创建对应的运行时类的对象。内部调用了运行时类的空参构造器
        Person person = aClass.newInstance();

        System.out.println(person);//Person{name='null', age=0}
    }


    //体会反射的动态性：只有在运行时才知道创建的是哪个类的对象
    @Test
    public void test2(){
        int i = new Random().nextInt(3);//0, 1, 2
        String classPath = "";
        switch (i){
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "cn.zy.java.exer1.Person";
                break;
        }

        try {
            Object instance = getInstance(classPath);
            System.out.println(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //classPath:指定类的全类名
    public Object getInstance(String classPath) throws Exception{
        Class<?> aClass = Class.forName(classPath);

        return aClass.newInstance();
    }
}
