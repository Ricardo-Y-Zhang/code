package com.zy.java;

public class MethodExer1 {
    public static void main(String[] args) {
        Student1[] stu = new Student1[20];
        //初始化
        for(int i = 0; i < stu.length; i++){
            stu[i] = new Student1();
            stu[i].number = i + 1;
            //state: [1,6]随机数
            stu[i].state = (int) (Math.random() * (6- 0 + 1) + 1);
            //score：[0,100]随机数
            stu[i].score = (int) (Math.random() * (100 - 0 + 1) + 0);

        }

        //state = 3
        for(int i = 0; i < stu.length; i++){
            if(stu[i].state == 3){
                System.out.println(stu[i].info());
            }
        }
        System.out.println("*******************");

        //bubbleSort
        for(int i = 0; i < stu.length - 1; i++){
            for(int j = 0; j < stu.length-i-1; j++){
                if(stu[j].score > stu[j+1].score){
                    Student1 temp = new Student1();
                    temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < stu.length; i++){
            System.out.println(i+1 +":\t" + stu[i].info());
        }
    }
}
class Student1{
    int number;
    int state;
    int score;

    public String info(){
        String str = "number: " + number  + "\t" + "state: " + state + "\t" + "score: " + score;
        return str;
    }
}
