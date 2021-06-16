package cn.zy.java;

import java.util.Scanner;

class IfExer2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int dogAge;

		double humanAge;

		System.out.println("请输入狗的年龄：");

		dogAge = scan.nextInt();

		while(dogAge < 0){
			System.out.println("输入有误，请重新输入：");

			dogAge = scan.nextInt();
		}

		if(dogAge <= 2){
			humanAge = dogAge * 10.5;
		}else {
			humanAge = 21 + (dogAge - 2) * 4;
		}
		System.out.println("humanAge = " + humanAge);
	}
}