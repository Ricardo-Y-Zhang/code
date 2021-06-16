package com.zy.java.exer;

import java.util.Scanner;

class WhileExer1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入：");

		int temp = scan.nextInt(), num1 = 0, num2 = 0;

		while(temp != 0){
			if(temp > 0){
				num1++;
			}else{
				num2++;
			}
			temp = scan.nextInt();
		}
		System.out.println("正数：" + num1 + "\n" + "负数：" + num2);
	}
}