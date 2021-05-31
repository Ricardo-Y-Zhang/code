package src.cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-05-31 15:45
 **/
public class Student extends Person{
    protected String school = "pku";

    public String getInfo(){
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "School: " + school;
    }
}
