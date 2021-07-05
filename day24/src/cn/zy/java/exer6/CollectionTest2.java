package cn.zy.java.exer6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-05 16:21
 **/
public class CollectionTest2 {
    //学生名和考试分数录入到集合中，并按分数显示前三名学员的名字
    public static void main(String[] args){

        Student s3 = new Student("张三", 99, 1001);
        Student s2 = new Student("李四", 88, 1002);
        Student s1 = new Student("大司马", 66, 1003);
        Student s4 = new Student("厂长", 77, 1007);

        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return -Integer.compare(student.getScore(), t1.getScore());
            }
        });

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        int num = 0;
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext() && num < 3){
            num++;
            System.out.println("No" + num + iterator.next().getName());

        }
    }
}

class Student{
    private String name;
    private int score;
    private int id;

    public Student(String name, int score, int id) {
        this.name = name;
        this.score = score;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }
}