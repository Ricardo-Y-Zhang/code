package cn.zy.java.exer4;

import cn.zy.java.exer1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @program: code
 * @description: 获取运行时类的方法结构
 * @author: Mr.Yan
 * @create: 2021-07-15 11:02
 **/
public class MethodTest {

    //获取运行时类的方法的整体结构
    @Test
    public void test1(){

        Class<Person> personClass = Person.class;

        //getMethods()：获取当前运行时类及其所有父类中声明为public的方法
        Method[] methods = personClass.getMethods();

        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println("\n");

        //getDeclaredMethods()：获取当前运行时类中声明的所有方法（不包含父类中声明的）
        Method[] declaredMethods = personClass.getDeclaredMethods();

        for(Method m : declaredMethods){
            System.out.println(m);
        }
    }

    //@Xxx
    //权限修饰符 返回值类型 方法名（形参列表） throws XxxException{}
    @Test
    public void test2(){

        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();
        for (Method m : methods){
            //1. 获取方法声明的注解(一个方法可能有多个注解)
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations){
                System.out.print(a + "\t");
            }

            //2. 权限修饰符
            int modifiers = m.getModifiers();
            System.out.print(Modifier.toString(modifiers) + "\t");

            //3. 返回值类型
            System.out.print(m.getReturnType().getName() + "\t");

            //4. 方法名
            System.out.print(m.getName() + "(");

            //5. 形参列表
            Class<?>[] parameterTypes = m.getParameterTypes();
            if (!(parameterTypes == null || parameterTypes.length == 0)){
                for (int i = 0; i < parameterTypes.length; i++) {
                    System.out.print(parameterTypes[i].getName() + " args_" + i);
                    if (i != parameterTypes.length - 1){
                        System.out.print(", ");
                    }
                }
            }
            System.out.print(")");

            //6. 抛出的异常
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if(!(exceptionTypes == null || exceptionTypes.length == 0)){
                System.out.print("throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    System.out.print(exceptionTypes[i].getName());
                    if (i != exceptionTypes.length - 1){
                        System.out.print(", ");
                    }
                }
            }


            System.out.println("{}\n");
        }
    }
}
