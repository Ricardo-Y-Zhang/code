package com.goodrock.java.exer1;

public class PassObject {
    public static void main(String[] args){
        Circle circle = new Circle();

        PassObject test = new PassObject();

        test.printAreas(circle, 5);

        System.out.println("now radius is " + circle.radius);
    }
    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");

        for(int i = 1; i <= time; i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.Area());
        }
        c.radius = time + 1;
    }
}
