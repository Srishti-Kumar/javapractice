package com.functions;

import java.util.Scanner;

public class above18voting {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligibility(age);
    }

    public static void eligibility(int age){
        if (age>=18){
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
