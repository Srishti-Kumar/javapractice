package com.PatternQuestions;

import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int row = sc.nextInt();
        System.out.println("Enter column");
        int column = sc.nextInt();

        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

//*****
//*****
//*****
//*****
//*****
