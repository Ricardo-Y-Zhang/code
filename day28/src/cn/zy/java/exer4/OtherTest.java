package cn.zy.java.exer4;

import cn.zy.java.exer1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @program: code
 * @description: 获取运行时类的其他结构
 * @author: Mr.Yan
 * @create: 2021-07-15 14:20
 **/
public class OtherTest {

    //获取运行时类的构造器
    @Test
    public void test1(){
        Class<Person> personClass = Person.class;
        //getConstructors():获取当前运行时类中声明为public的构造器
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor c : constructors){
            System.out.println(c);
        }
        System.out.println();

        //getDeclaredConstructors:获取当前运行时类中声明的所有的构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for(Constructor c : declaredConstructors){
            System.out.println(c);
        }
    }

    //获取运行时类的父类
    @Test
    public void test2(){
        Class<Person> personClass = Person.class;

        Class<? super Person> superclass = personClass.getSuperclass();

        System.out.println(superclass.getName());
    }

    //获取运行时类带泛型的父类
    @Test
    public void test3(){
        Class<Person> personClass = Person.class;

        Type genericSuperclass = personClass.getGenericSuperclass();

        System.out.println(genericSuperclass);
    }

    //获取运行时类带泛型的父类的泛型
    @Test
    public void test4(){
        Class<Person> personClass = Person.class;

        Type genericSuperclass = personClass.getGenericSuperclass();

        ParameterizedType superclass = (ParameterizedType) genericSuperclass;
        //获取泛型类型
        Type[] actualTypeArguments = superclass.getActualTypeArguments();
        System.out.println(actualTypeArguments[0].getTypeName());
    }


    //获取运行时类实现的接口
    @Test
    public void test5(){
        Class<Person> personClass = Person.class;

        Class<?>[] interfaces = personClass.getInterfaces();

        for (Class i : interfaces){
            System.out.println(i.getName());
        }
    }


    //获取当前运行时类所在的包
    @Test
    public void test6(){
        Class<Person> personClass = Person.class;

        Package aPackage = personClass.getPackage();
        System.out.println(aPackage);
    }


    //获取运行时类声明的注解
    @Test
    public void test7(){
        Class<Person> personClass = Person.class;

        Annotation[] annotations = personClass.getAnnotations();

        for(Annotation a : annotations){
            System.out.println(a);
        }
    }
}
