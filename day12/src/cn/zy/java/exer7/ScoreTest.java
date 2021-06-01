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
        Vector v = new Vector();


        //实例化Scanner，键盘输入
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入成绩：");

        int score = scanner.nextInt();

        while(score > 0){
            //自动装箱
            v.addElement(score);
        }


        int max = -1;
        for(int i = 0; i < v.size(); i++){
            Object obj =  v.elementAt(i);

            Integer temp = (Integer) obj;
            int temp1 = temp;

            if(temp1 > max){
                max = temp1;
            }
        }

        System.out.println("max = " + max);

        for(int i = 0; i < v.size(); i++){
            Object obj =  v.elementAt(i);

            Integer temp = (Integer) obj;
            int temp1 = temp;

            if(max - temp1 <= 10){
                System.out.println("v[" + i + "]: " + temp1 + "—— A " );
            }else if(max - temp1 <= 20){
                System.out.println("v[" + i + "]: " + temp1 + "—— B " );
            }else if(max - temp1 <= 30){
                System.out.println("v[" + i + "]: " + temp1 + "—— C " );
            }else{
                System.out.println("v[" + i + "]: " + temp1 + "—— D " );
            }
        }
    }
}
