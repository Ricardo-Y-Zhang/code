package src.cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-05-31 15:47
 **/
public class Graduate extends Student{
    public String major = "IT";

    public String getInfo(){
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "School: " + school + "\n" + "Major: " + major;
    }
}
