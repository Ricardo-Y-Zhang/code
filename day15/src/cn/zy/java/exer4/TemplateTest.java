package src.cn.zy.java.exer4;

import java.awt.*;

/**
 * @program: code
 * @description: 模板方法设计模式
 * @author: Mr.Yan
 * @create: 2021-06-04 17:19
 **/
public class TemplateTest {
    public static void main(String[] args) {

        //匿名子类
        Template t1 = new Template() {
            @Override
            public void code() {
                int sum = 0;
                for(int i = 0; i < 100000; i++){
                    sum += i;
                }
                System.out.println(sum);
            }
        };
        t1.spendTime();





        Template s1 = new SubTemplate();

        s1.spendTime();
    }
}

abstract class Template{

    public void spendTime(){
        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println("花费时间： " + (end - start));
    }

    public abstract void code();
}

class SubTemplate extends Template{
    @Override
    public void code() {
        Label: for(int i = 2; i < 1000; i++){
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    continue Label;
                }
            }
            System.out.println(i);
        }
    }
}