package com.zy.java;

import java.util.Scanner;

class HelloWorld {
    public static void  main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的国家：");

        String country = scan.nextLine();

        System.out.println("hello " + country);
    }
}
