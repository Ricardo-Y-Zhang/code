package src.cn.zy.java.exer5;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-05 14:55
 **/
public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(){}

    public SalariedEmployee(String name, int number, int year, int month, int day, int monthlySalary){
        super(name, number, year, month, day);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee[ " + super.toString() + " ]";
    }
}
