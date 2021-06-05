package src.cn.zy.java.exer5;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-05 14:46
 **/
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(){}

    public MyDate(int year, int month, int day){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toDateString(){
        return year + "年" + month + "月" + day + "日";
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
