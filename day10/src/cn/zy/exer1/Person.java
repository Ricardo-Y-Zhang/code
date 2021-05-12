package src.cn.zy.exer1;

public class Person {
    private int age;
    private String name;

    public Person(){
        age = 18;
    }
    public Person(int a, String n){
        age = a;
        name = n;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
