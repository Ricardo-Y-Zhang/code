package cn.zy.java2;

public class PersonTest {
    public static void main(String[] args) {
        Person test = new Person();

        test.setAge(18);

        test.setName("Juice");

        System.out.println("Name\t\tAge");

        System.out.println(test.getName() + "\t\t" + test.getAge());

        test.eat();

        //this调用构造器
        Person test1 = new Person("this调用构造器");
        System.out.println(test1.getName() + "\t\t" + test1.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public Person(){
        this.age = 18;
    }
    public Person(String name){
        this();
        this.name = name;
        /*
        this();
        this调用构造器只能放在第一位
         */
    }

    //this关键字的使用
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //this关键字
    public void eat(){
        System.out.println("人吃饭");
        this.study();
    }

    public void study(){
        System.out.println("人学习");
    }
}


