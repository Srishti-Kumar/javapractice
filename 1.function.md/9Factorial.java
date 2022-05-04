package com.functions;

import java.util.Scanner;

public class factorialRecur {
    public static void main(String[] args) {
        System.out.println("Enter a num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n <=1){
            return 1;
        }
        int fact = 1;
        for (int i=n;i>0;i--){
            fact = fact*i;
        }
        return fact;
    }

}
