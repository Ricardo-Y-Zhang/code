package com.zy.java.exer;

class ForExer4{
	public static void main(String[] args){
		for (int i = 100; i < 1000; i++){
			int temp = i;
			int a = temp % 10;
			temp /= 10;
			int b = temp % 10;
			temp /= 10;
			int c = temp;
			if (a*a*a + b*b*b + c*c*c == i){
				System.out.print(i + " ");
			}
		}
	}
}