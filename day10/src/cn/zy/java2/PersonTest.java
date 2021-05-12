package src.cn.zy.java2;

public class PersonTest {
    public static void main(String[] args) {
        Person test = new Person();

        test.setAge(18);

        test.setName("Juice");

        System.out.println("Name\t\tAge");

        System.out.println(test.getName() + "\t\t" + test.getAge());

        test.eat();
    }
}

class Person{
    private String name;
    private int age;

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


