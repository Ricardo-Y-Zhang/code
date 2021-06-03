package src.cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-03 14:50
 **/
public class Person2 {
    //属性
    private String name;
    private int age;
    private static String desc = "我是一个人";

    //构造器
    public Person2(){}

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //代码块
    static{
        System.out.println("static代码块");
    }

    {
        System.out.println("非static代码块");
    }



    //方法

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static String getDesc() {
        return desc;
    }
}
