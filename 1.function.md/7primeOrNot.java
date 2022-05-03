package com.functions;

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(primeNum(n));
    }

    public static boolean primeNum(int n){
        //2,3,5,7
        if(n<=1)
            return false;

        for(int i = 2;i<n;i++) {
            //n/i == 0 not prime
            if (n % i == 0) return false;
        }
        return true;
    }
}
