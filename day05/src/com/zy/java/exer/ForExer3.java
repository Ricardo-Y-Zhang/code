package com.zy.java.exer;

class ForExer3{
	public static void main(String[] args){
		int num = 0, sum =0;
		for (int i =1; i <= 100; i++){
			if(i % 7 == 0){
				num++;
				sum += i;
			}
		}
		System.out.println("num = " + num + "sum = " + sum);
	}
}