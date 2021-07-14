package cn.zy.java.exer1;

import org.junit.Test;

import javax.net.ssl.SNIHostName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-14 14:03
 **/
public class ReflectionTest {

    //反射前
    @Test
    public void test1(){
        //1. 创建Person类的对象
        Person person = new Person("jack", 12);

        //2. 通过对象，调用其内部的属性，方法
        System.out.println(person);
        person.show();

        //在Person类外部，不能通过Person类的对象调用其内部私有结构
        //如：name
    }


    //反射后
    @Test
    public void test2() throws Exception{
        Class<Person> aClass = Person.class;
        //1. 通过反射创建Person类的对象
        Constructor<Person> constructor = aClass.getConstructor(String.class, int.class);

        Person person = constructor.newInstance("jack", 12);

        //2. 通过反射，调用指定的属性和方法
        //调用属性
        Field age = aClass.getDeclaredField("age");
        age.set(person, 10);
        System.out.println(person);

        //调用方法
        Method show = aClass.getDeclaredMethod("show");
        show.invoke(person);

        //通过反射，可以调用Person类的私有结构。如私有的构造器、属性、方法
        Constructor<Person> constructor1 = aClass.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Person person1 = constructor1.newInstance("jerry");
        System.out.println(person1);

        //调用私有的属性
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person1, "judy");
        System.out.println(person1);

        //调用私有的方法
        Method shows = aClass.getDeclaredMethod("shows", String.class);
        shows.setAccessible(true);
        shows.invoke(person, "伦纳德");

    }

    //获取Class实例的方式
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一：调用运行时类的属性：.class
        Class<Person> aClass1 = Person.class;
        System.out.println(aClass1);//class cn.zy.java.exer1.Person

        //方式二：通过运行时类的对象，调用getClass()
        Person person = new Person();
        Class<? extends Person> aClass2 = person.getClass();
        System.out.println(aClass2);//class cn.zy.java.exer1.Person

        //方式三：调用Class的静态方法：forName(String classPath)
        Class<?> aClass3 = Class.forName("cn.zy.java.exer1.Person");
        System.out.println(aClass3);//class cn.zy.java.exer1.Person

        //方式四：使用类的加载器：ClassLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> aClass4 = classLoader.loadClass("cn.zy.java.exer1.Person");
        System.out.println(aClass4);//class cn.zy.java.exer1.Person


        System.out.println(aClass1 == aClass2);//true
        System.out.println(aClass1 == aClass3);//true
        System.out.println(aClass1 == aClass4);//true
    }
}
