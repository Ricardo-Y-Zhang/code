package cn.zy.java.exer11;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-06 15:01
 **/
public class Man implements Filial, Spoony{

    @Override
    public void help() {
        System.out.println("我该怎么办？");

        //调用filial中的help方法
        Filial.super.help();

        //调用spoony中的help方法
        Spoony.super.help();
    }
}
