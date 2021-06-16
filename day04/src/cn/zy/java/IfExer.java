package cn.zy.java;

import java.util.Scanner;

class IfExer {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);		

		int num1, num2;
			
		System.out.println("请输入第一个数：");

		num1 = scan.nextInt();

		System.out.println("请输入第二个数：");

		num2 = scan.nextInt();

		if (num1 + num2 >= 50){
			System.out.println("hello world!");
		}		
		
	}
}