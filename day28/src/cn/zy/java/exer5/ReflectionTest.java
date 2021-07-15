package cn.zy.java.exer5;

import cn.zy.java.exer1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: code
 * @description: 调用运行时类中指定的结构：属性、方法、构造器
 * @author: Mr.Yan
 * @create: 2021-07-15 15:29
 **/
public class ReflectionTest {

    @Test
    public void testField() throws Exception {
        Class<Person> personClass = Person.class;
        //创建运行时类的对象,newInstance()：默认调用空参构造器
        Person person = personClass.newInstance();

        //获取指定的属性：要求运行时类属性声明为public
        //通常不使用此方法
        Field age = personClass.getField("age");

        /*
        设置当前属性的值
        set()：参数1：指明设置哪个对象的属性   参数2：将此属性值设置为多少
         */
        age.set(person, 18);

        /*
        get()：参数1：获取哪个对象的当前属性值
         */
        System.out.println(age.get(person));
    }

    //操作运行时类的指定属性
    @Test
    public void testField1() throws Exception{
        Class<Person> personClass = Person.class;

        //创建运行时类的对象
        Person person = personClass.newInstance();

        //1. getDeclaredField(String fieldName)：获取运行时类中指定变量名的属性
        Field name = personClass.getDeclaredField("name");

        //2. setAccessible(true)：保证当前属性是可访问的
        name.setAccessible(true);

        //3. 获取、指定对象的此属性值
        name.set(person, "jack");
        System.out.println(name.get(person));
    }


    //操作运行时类中的指定方法
    @Test
    public void testMethod() throws Exception{
        Class<Person> personClass = Person.class;

        Person person = personClass.newInstance();

        //1. getDeclaredMethod()：参数1：指明获取的方法的名称    参数2：指明获取的方法的形参列表（方法的重载）
        Method shows = personClass.getDeclaredMethod("shows", String.class);

        //2. 保证当前方法是可访问的
        shows.setAccessible(true);

        //3. invoke()：参数1：方法的调用者   参数2：给方法形参赋值的实参
        //invoke()的返回值即为对应类中调用的方法的返回值
        Object elk = shows.invoke(person, "elk");
        System.out.println(elk);

    }


    //调用运行时类中指定的构造器
    @Test
    public void testConstructor() throws Exception{
        Class<Person> personClass = Person.class;

        //1. 获取指定的构造器：getDeclaredConstructor()：参数：指明构造器的参数列表
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class, int.class);

        //2. 保证此构造器是可访问的：setAccessible(true)
        declaredConstructor.setAccessible(true);

        //3. 调用此构造器创建运行时类的对象
        Person jack = declaredConstructor.newInstance("jack", 18);
        System.out.println(jack);
    }
}
