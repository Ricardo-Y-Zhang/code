package cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-04 14:22
 **/
public class Manager extends Employee{
    private int bonus;

    public Manager(){}

    public Manager(String name, int id, int salary, int bonus){
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public void work() {
        System.out.println("push employee");
    }
}
