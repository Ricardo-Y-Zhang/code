package cn.zy.java.exer7;

import org.junit.Test;

import java.util.Optional;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-18 17:20
 **/
public class OptionalTest {

    @Test
    public void test1(){

        Girl girl = new Girl();
        //of()：保证t是非空的
        Optional<Girl> optionalGirl = Optional.of(girl);
        System.out.println(optionalGirl);
    }

    @Test
    public void test2(){
        Girl girl = new Girl();
        //ofNullable()：t可以为null
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);

        //orElse(T t)：如果当前Optional内部封装的t是非空的，则返回内部的t；t是空的，则返回orElse()方法中的参数t1
        Girl girl1 = optionalGirl.orElse(new Girl("赵丽颖"));
        System.out.println(girl1);

        //get()：调用对象包含值
        Girl girl2 = optionalGirl.get();
        System.out.println(girl2);

    }

    @Test
    public void test3(){
        //emtpy(): 创建空的Optional对象，内部value为null
        Optional<Object> empty = Optional.empty();
        //判断是否包含对象
        System.out.println(empty.isPresent());//false

        //of(T t)：封装数据t生成Optional对象，t必须为非空
        Optional<String> optionalS = Optional.of("hello");
        //如果Optional封装的数据为空，则get()报错
        System.out.println(optionalS.get());//hello
    }

    @Test
    public void test4(){

        //ofNullable(T t)：不要求t非空
        Optional<String> str = Optional.ofNullable("str");
        //orElse(T t1)：如果Optional内部的value非空，则返回此value值。若value为空，返回t1
        String str2 = str.orElse("str2");

    }

}
