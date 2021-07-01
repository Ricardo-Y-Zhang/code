package cn.zy.java.exer4;

import java.util.Objects;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-01 11:14
 **/
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Person person) {
        if(this.name.equals(person.name)){
            return Integer.compare(this.age, person.age);
        }else{
            return this.name.compareTo(person.name);
        }
    }
}
