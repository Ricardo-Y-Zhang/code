package cn.zy.java.exer2;

/**
 * @program: code
 * @description: 抽象类
 * @author: Mr.Yan
 * @create: 2021-06-04 14:18
 **/
public abstract class Employee {
    String name;
    int id;
    int salary;

    public Employee(){}
    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
