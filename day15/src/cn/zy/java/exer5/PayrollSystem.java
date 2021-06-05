package src.cn.zy.java.exer5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-05 15:34
 **/
public class PayrollSystem {
    public static void main(String[] args) {


        //多态
        Employee[] em1 = new Employee[2];

        em1[0] = new SalariedEmployee("Jack", 1000, 97, 7, 18, 30000);

        em1[1] = new HourlyEmployee("Juce", 1001, 96, 8, 22, 400, 40);

        for(int i = 0; i < em1.length; i++){

            //虚拟方法调用，直接调用toString（）方法
            System.out.println(em1[i]);
            System.out.println("salary： " + em1[i].earnings());

        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入当前月份： ");

        int month = scanner.nextInt();

        for(int i = 0; i < em1.length; i++){
            if(em1[i].getBirthday().getMonth() == month){
                System.out.println( "生日： " + em1[i].getBirthday().toDateString());

                //虚拟方法调用
                System.out.println("salary: " + em1[i].earnings());
            }
        }
    }
}
