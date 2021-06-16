package cn.zy.java;

import java.util.Scanner;

class IfExer3{
	public static void main(String[]	args){
		
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入一个整数：");	
	
		int num1 = scan.nextInt();

		int num2 = (int)(Math.random()*90 + 10);

		System.out.println("num1 = " + num1  + "\n" + "num2 = " + num2);

		int n1 = num1 / 10, n2 = num1 % 10;

		int m1 = num2 / 10, m2 = num2 % 10;		

		if(num1 == num2){
			
			System.out.println("奖金：10000美元");
	
		}else if (n1 == m2 && n2 == m1){
			
			System.out.println("奖金：3000美元");
	
		}else if (n1 == m1 || n2 == m2){
	
			System.out.println("奖金：1000美元");
	
		}else if (n1 == m2 || n2 == m1){
	
			System.out.println("奖金：500美元");
	
		}else {
	
			System.out.println("nothing");
		
		}
	}
}