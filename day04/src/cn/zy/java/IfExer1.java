package cn.zy.java;

import java.util.Scanner;

class IfExer1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		double num1, num2;

		System.out.println("请输入第一个数：");

		num1= scan.nextDouble();

		System.out.println("请输入第二个数：");

		num2 = scan.nextDouble();

		if(num1 > 10.0 && num2 < 20.0){
			System.out.println("num1 + num2 = " + (num1 + num2));
		}else {
			System.out.println("num1 * num2 = " + num1*num2);
		}
	}
}