package cn.zy.java;

import java.util.Scanner;

class IfExer4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入身高：");

		double height = scan.nextDouble();
		
		System.out.println("请输入财富值：（万元）");
		
		double wealth = scan.nextDouble();

		System.out.println("请输入帅气值：是/否");

		String handsome = scan.next();

		if(height > 180 && wealth > 1000 && handsome.equals("是")){
			System.out.println("我一定要嫁给她！");
		} else if(height > 180 || wealth > 1000 || handsome.equals("是")){
			System.out.println("marry，比上不足，比下有余");
		}else {
			System.out.println("no!");
		}
	}
}