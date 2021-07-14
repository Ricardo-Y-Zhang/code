package cn.zy.java.exer3;

import cn.zy.java.exer1.Person;
import org.junit.Test;

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

        System.out.println(person);
    }
}
