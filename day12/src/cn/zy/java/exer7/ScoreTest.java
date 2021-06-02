package src.cn.zy.java.exer7;

import java.util.Scanner;
import java.util.Vector;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-01 16:46
 **/
public class ScoreTest {
    public static void main(String[] args) {

        //实例化Scanner，键盘输入
        Scanner scanner = new Scanner(System.in);


        //vector动态数组，添加数据
        Vector v = new Vector();

        System.out.println("输入成绩：");

        double score = scanner.nextDouble();

        while(score > 0){
            //自动装箱：基本数据类型转换为包装类
            v.addElement(score);

            score = scanner.nextDouble();
        }


        //遍历vector，找max
        double max = 0;
        for(int i = 0; i < v.size(); i++){

            //自动拆箱：包装类转换为基本数据类型
            double temp = (Double) v.elementAt(i);
            //或double temp = (double) v.elementAt(i);

            if(temp > max){
                max = temp;
            }
        }

        System.out.println("max = " + max);

        for(int i = 0; i < v.size(); i++){
            double temp = (Double) v.elementAt(i);

            if(max - temp <= 10){
                System.out.println("v[" + i + "]: " + temp + "\t—— A " );
            }else if(max - temp <= 20){
                System.out.println("v[" + i + "]: " + temp + "\t—— B " );
            }else if(max - temp <= 30){
                System.out.println("v[" + i + "]: " + temp + "\t—— C " );
            }else{
                System.out.println("v[" + i + "]: " + temp + "\t—— D " );
            }
        }

    }
}
