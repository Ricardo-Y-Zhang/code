package com.zy.java;

public class PersonExer {
    public static void main(String[] args){
        Persons p1 = new Persons();//类的实例化

        p1.name = "Jack";
        p1.age = 10;
        p1.sex = 1;

        p1.study();

        p1.showAge();

        System.out.println("addAge: " + p1.addAge(10));
    }
}
class Persons {
    String name;
    int age;
    /**
     * sex: 1 男性
     * sex：0 女性
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("Age: " + age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
