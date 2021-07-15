package cn.zy.java.exer4;

import cn.zy.java.exer1.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @program: code
 * @description: 获取当前运行时类的属性结构
 * @author: Mr.Yan
 * @create: 2021-07-15 10:33
 **/
public class FieldTest {

    @Test
    public void test1(){
        Class<Person> aClass = Person.class;

        //获取属性结构
        //getFields()：获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = aClass.getFields();
        for(Field temp : fields){
            System.out.println(temp);
        }

        System.out.println("\n");

        //getDeclaredFields()：获取当前运行时类中声明的所有属性（不包含父类中声明的属性）
        Field[] declaredFields = aClass.getDeclaredFields();
        for(Field temp : declaredFields){
            System.out.println(temp);
        }
    }


    //权限修饰符 数据类型 变量名
    @Test
    public void test2(){
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field f : declaredFields){
            //1. 权限修饰符
            int modifiers = f.getModifiers();
            String s = Modifier.toString(modifiers);
            System.out.println(s);
            //2. 数据类型
            Class<?> type = f.getType();
            System.out.println(type.getName());

            //3. 变量名
            String name = f.getName();
            System.out.println(name);
        }
    }
}
