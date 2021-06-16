package cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-04 14:26
 **/
public class CommonEmployee extends Employee{
    public CommonEmployee(){}

    public CommonEmployee(String name, int id, int salary){
        super(name, id, salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void work() {
        System.out.println("good work");
    }
}
