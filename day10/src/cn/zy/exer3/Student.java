package cn.zy.exer3;

public class Student {
    private String name;
    private int age;
    private String school;
    private String major;

    //构造器
    public Student(){

    }
    public Student(String n, int a){
        name = n;
        age = a;
    }
    public Student(String n, int a, String s){
        name = n;
        age = a;
        school = s;
    }
    public Student(String n, int a, String s, String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSchool(){
        return school;
    }
    public String getMajor(){
        return major;
    }
}
