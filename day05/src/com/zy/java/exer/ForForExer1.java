package com.zy.java.exer;

class ForForExer1{
	public static void main(String[] args){
		for(int i = 1; i < 10; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + (i*j));
				if(i != j){
					System.out.print(" ");
				}else{

					System.out.println();
				}
			}
		}
	}
}