package cn.zy.java;/*
	键盘输入三个整数num1, num2, num3
	从小到大输出
*/

import java.util.Scanner;

class IfTest1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();
		
		if(num1 >= num2){
			if (num3 >= num1){
				System.out.println(num3 + "," + num1 + "," + num2);
			}else if(num2 >= num3){
				System.out.println(num1 + "," + num2 + "," + num3);
			}else{
				System.out.println(num1 + "," + num3 + "," + num2);
			}
		}else{
			if (num3 >= num2){
				System.out.println(num3 +","+ num2 + "," + num1);
			}else if(num1 >= num3){
				System.out.println(num2 + "," + num1 + "," + num3);
			}else{
				System.out.println(num2 + "," + num3 + "," + num1);
			}
		}
		
	}
}