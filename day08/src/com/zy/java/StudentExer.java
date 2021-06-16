package com.zy.java;

public class StudentExer {
    public static void main(String[] args){
        Student stu = new Student();
        stu.name = "Jack";
        stu.age = 10;
        stu.major = "math";
        stu.interests = "swim";
        System.out.println(stu.say());
    }
}
class Student {
    String name;
    int age;
    String major;
    String interests;
    public String say(){
        return ("name: " + name + "\n" + "age: " + age +"\n" + "major: " + major +"\n" + "interests: " + interests);
    }
}