package cn.goodrock.java.exer1;

/**
 * @program: code
 * @description: 子类
 * @author: Mr.Yan
 * @create: 2021-05-20 15:13
 **/
public class Student extends Person{
    private int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study(){
        System.out.println("学习");
    }
}
