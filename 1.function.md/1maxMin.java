package com.functions;

import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        System.out.print("Enter a,b,c: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Max of 3 is: " + max(a,b,c));
        System.out.println("Min of 3 is: " + min(a,b,c));
        //max(a,b,c);
        //min(a,b,c);
    }

    public static int max(int a,int b,int c) {
        if(a>b){
            if(a>c){
                return a;
            }

            else{
                return c;
            }

        }
        else{
            if(b>c){
                return b;
            }
            else {
                return c;
            }
        }
    }

    public static int min(int a,int b,int c){
        if(a<b){
            if(a<c){
                return a;
            }

            else{
                return c;
            }

        }
        else{
            if(b<c){
                return b;
            }
            else {
                return c;
            }
        }
    }
}

