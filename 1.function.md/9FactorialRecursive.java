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
        else {
            return factorial(n-1)*n;
        }
    }

}
