package cn.goodrock.exer;

import java.util.Scanner;
public class ArrayExer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int num = scan.nextInt();
        System.out.println("请输入学生成绩：");
        int[] score = new int[num];
        int max = -1;
        for (int i = 0; i < score.length; i++){
            score[i] = scan.nextInt();
            if(max < score[i]){
                max = score[i];
            }
        }
        System.out.println("最高分：" + max);
        for(int i = 0; i < score.length; i++){
            System.out.print("student " + i + "score is " + score[i] + "grade is " );
            if(score[i] >= max - 10){
                System.out.println("A");
            }else if(score[i] >= max - 20){
                System.out.println("B");
            }else if (score[i] >= max -30){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
        }
    }
}
