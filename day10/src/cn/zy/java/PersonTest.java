package src.cn.zy.java;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Tom");
        Person p3 = new Person("Jack", 18);

    }
}
class Person{
    private String name;
    private int age;

    public Person(){
        System.out.println("Person()");
    }

    public Person(String n){
        name = n;
        System.out.println("Person(string n)");
    }

    public Person(String n, int a){
        name = n;
        age = a;
        System.out.println("Person(String n, int a)");
    }

    public String getName(){
        return name;
    }
}
