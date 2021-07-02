package cn.zy.java.exer1;

import org.junit.Test;

import java.util.BitSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-02 11:23
 **/
public class TreeSetTest {

    @Test
    public void test1(){
        TreeSet<Employee> employees = new TreeSet<Employee>();

        employees.add(new Employee("Tom", 24, new MyDate(1997, 7, 18)));
        employees.add(new Employee("Jack", 18, new MyDate(2003, 10, 19)));
        employees.add(new Employee("Juce", 22, new MyDate(1999, 8, 22)));
        employees.add(new Employee("Candy", 21, new MyDate(1998, 8, 7)));
        employees.add(new Employee("Cindy", 20, new MyDate(2020, 6, 12)));

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        TreeSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                MyDate birthday = employee.getBirthday();
                MyDate birthday1 = t1.getBirthday();

                if (Integer.compare(birthday.getYear(), birthday1.getYear()) != 0) {
                    return Integer.compare(birthday.getYear(), birthday1.getYear());
                } else if (Integer.compare(birthday.getMonth(), birthday1.getMonth()) != 0) {
                    return Integer.compare(birthday.getMonth(), birthday1.getMonth());
                } else {
                    return Integer.compare(birthday.getDay(), birthday1.getDay());
                }
            }
        });

        employees.add(new Employee("Tom", 24, new MyDate(1997, 7, 18)));
        employees.add(new Employee("Jack", 18, new MyDate(2003, 10, 19)));
        employees.add(new Employee("Juce", 22, new MyDate(1999, 8, 22)));
        employees.add(new Employee("Candy", 21, new MyDate(1998, 8, 7)));
        employees.add(new Employee("Cindy", 20, new MyDate(2020, 6, 12)));

        for(Employee temp : employees){
            System.out.println(temp);
        }
    }
}
