package cn.zy.java.exer3;

import java.util.Objects;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-05 13:47
 **/
public class User implements Comparable{
    private String name;
    private int age;


    public User(){}

    public User(String name, int age) {
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

    //按name从大到小，age从小到大
    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User) o;
            if(this.name.equals(user.name)){
                return Integer.compare(this.age, user.age);
            }else{
                return -this.name.compareTo(user.name);
            }
        }

        throw new RuntimeException("输入类型不一致");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
