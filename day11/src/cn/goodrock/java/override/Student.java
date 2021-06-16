package cn.goodrock.java.override;

/**
 * @program: code
 * @description: 子类
 * @author: Mr.Yan
 * @create: 2021-05-21 10:10
 **/
public class Student extends Person{
    private String major;

    public Student(){}

    public Student(String major){
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void study(){
        System.out.println("major是" + major);
    }

    //对父类Person中eat方法的override
    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }


}
