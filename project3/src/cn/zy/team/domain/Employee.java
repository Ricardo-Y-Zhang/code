package src.cn.zy.team.domain;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-11 16:14
 **/
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(){}

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //方便子类调用，super.super.toString() 错误语法
    public String getDetails(){
        return id + "\t" + name + "\t" + age + "\t" + salary;
    }


    @Override
    public String toString() {
        return getDetails();
    }
}
