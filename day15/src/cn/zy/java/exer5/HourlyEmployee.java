package cn.zy.java.exer5;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-05 15:31
 **/
public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;


    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, int year, int month, int day, double wage, double hour) {
        super(name, number, year, month, day);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }


    @Override
    public String toString() {
        return "HourlyEmployee[ " + super.toString() + " ]" ;
    }
}
