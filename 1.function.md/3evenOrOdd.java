package com.functions;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        System.out.println("Ente any num:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //evenOdd(num);
        System.out.println("Number is even ? : "+evenOdd(num));
    }

    public static boolean evenOdd(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}
