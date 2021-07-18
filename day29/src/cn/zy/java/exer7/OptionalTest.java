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


}
