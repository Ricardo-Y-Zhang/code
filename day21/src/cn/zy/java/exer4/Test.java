package cn.zy.java.exer4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: code
 * @description: 三天打鱼两天晒网，从1990-01-01开始
 * @author: Mr.Yan
 * @create: 2021-06-22 23:13
 **/
public class Test {
    public static void main(String[] args) throws ParseException {
        String str1 = "1990-01-01";
        String str2 = "2021-06-22";

        //将字符串转换为Date类
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date parse1 = simpleDateFormat.parse(str1);
        Date parse2 = simpleDateFormat.parse(str2);

        //计算天数
        long total = parse2.getTime() - parse1.getTime();
        int oneDay = 24 * 60 * 60 * 1000;

        long day = total / oneDay;
        if(total % oneDay == 0){
            day++;
        }

        int temp = (int)day % 5;
        if(temp == 1 || temp == 2 || temp == 3){
            System.out.println("打鱼");
        }else{
            System.out.println("晒网");
        }
    }
}
