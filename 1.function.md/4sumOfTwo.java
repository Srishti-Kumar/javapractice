package com.functions;

import java.util.Scanner;

public class sumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = sc.nextFloat();
        System.out.println("Enter b: ");
        float b = sc.nextFloat();
        System.out.println("Sum is : "+sum(a,b)+" in float");
        //typecasting float to int => Narrow typecasting (int) for wide compiler does automatically
        System.out.println("Sum is : "+ (int) sum(a, b)+" in integer");

    }
    public static float sum(float a,float b){
        return a+b;
    }
}
