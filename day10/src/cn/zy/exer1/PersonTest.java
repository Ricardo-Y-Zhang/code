package cn.zy.exer1;

public class PersonTest {
    public static void main(String[] args) {
        Person test = new Person();

        System.out.println("Age = " + test.getAge());

        Person test2 = new Person(19, "Jack");

        System.out.println("name : " + test2.getName() + "\t\t" + "age : " + test2.getAge());
    }
}
