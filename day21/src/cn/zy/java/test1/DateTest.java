package cn.zy.java.test1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-29 09:44
 **/
public class DateTest {

    @Test
    public void test1() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //java.util.Date
        Date parse = simpleDateFormat.parse("2017-08-16");

        java.sql.Date date = new java.sql.Date(parse.getTime());

        System.out.println(date.getClass());//class java.sql.Date
    }


    @Test
    public void test2() {
        Person[] peoples = new Person[4];
        peoples[0] = new Person("akali", 17);
        peoples[1] = new Person("leikedun", 18);
        peoples[2] = new Person("akali", 15);
        peoples[3] = new Person("lakesi", 16);

        Arrays.sort(peoples);
        System.out.println(Arrays.toString(peoples));//[Person{name='akali', age=15}, Person{name='akali', age=17}, Person{name='lakesi', age=16}, Person{name='leikedun', age=18}]

    }

    @Test
    public void test3() {
        Person[] peoples = new Person[4];
        peoples[0] = new Person("akali", 17);
        peoples[1] = new Person("leikedun", 18);
        peoples[2] = new Person("akali", 15);
        peoples[3] = new Person("lakesi", 16);

        Arrays.sort(peoples, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                if (person.getName().equals(t1.getName())) {
                    return Integer.compare(person.getAge(), t1.getAge());
                } else {
                    return person.getName().compareTo(t1.getName());
                }
            }
        });

        System.out.println(Arrays.toString(peoples));//[Person{name='akali', age=15}, Person{name='akali', age=17}, Person{name='lakesi', age=16}, Person{name='leikedun', age=18}]
    }

    @Test
    public void test4() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        LocalDate parse = LocalDate.parse("2017-08-16", dateTimeFormatter);

        java.sql.Date date = java.sql.Date.valueOf(parse);

        System.out.println(date.getClass() + " - " + date);//class java.sql.Date - 2017-08-16

    }
}

class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person p1 = (Person) o;

            if(this.name.equals(p1.getName())){
                return Integer.compare(this.age, p1.getAge());
            }else{
                return this.name.compareTo(p1.getName());
            }
        }
        throw new RuntimeException("传入数据类型不一致");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
