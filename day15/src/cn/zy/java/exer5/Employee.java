package src.cn.zy.java.exer5;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-05 14:44
 **/
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee(){}

    public Employee(String name, int number, int year, int month, int day){
        this.name = name;
        this.number = number;
        this.birthday = new MyDate(year, month, day);
    }

    //抽象方法
    public abstract double  earnings();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
