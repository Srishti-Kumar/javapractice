package com.functions;

import java.util.Scanner;

public class swapNum {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+" "+b);
        swapNumber(a,b);
    }
    static public void swapNumber(int a, int b) {
        int temp = a;
        a = b;
        b= temp;
        System.out.println(a+" "+b);
    }

}
