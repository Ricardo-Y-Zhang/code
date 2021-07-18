package cn.zy.java.exer6;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-18 11:01
 **/
public class Employee implements Comparable<Employee>{
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<Employee> getEmployees(){
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("马云", 1000));
        employees.add(new Employee("马化腾", 1001));
        employees.add(new Employee("雷军", 1002));
        employees.add(new Employee("任正非", 1004));
        return employees;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return name.compareTo(employee.name);
    }
}
