package src.cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-05-31 15:42
 **/
public class Person {
    protected String name = "person";

    protected int age = 50;

    public String getInfo(){
        return "Name: " + name + "\n" + "Age: " + age;
    }
}
