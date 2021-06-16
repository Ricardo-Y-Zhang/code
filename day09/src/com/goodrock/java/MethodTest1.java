package com.goodrock.java;

public class MethodTest1 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        Method(a, b);
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    public static void Method(int a, int b){
        a *= 10;
        b *= 10;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        //终止虚拟机
        System.exit(0);
    }
}
