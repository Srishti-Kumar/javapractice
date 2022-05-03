package com.functions;

import java.util.Scanner;

public class circumferenceNarea {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("Circumference of circle is:"+ circumference(r)+ " meters");
        System.out.println("Area of circle is:"+ area(r)+ " meters-per-sq");
    }

    public static double circumference(double r){
        //2*pie*r
        return 2*3.14*r;

    }
    public static double area(double r){
        //pie*r*r
        return 3.14*r*r;
    }
}
