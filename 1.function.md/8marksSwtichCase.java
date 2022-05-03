package com.functions;
//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//
//
//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail

import java.util.Scanner;

public class marksGiven {
    public static void main(String[] args) {
        System.out.println("enter your marks: ");
        Scanner sc = new Scanner(System.in);
        double marks = sc.nextDouble();
        //int gpa  =(int) marks/10;
        String grade;
        switch ((int) (marks-1) / 10) {
            case 9:
                grade = "AA";
                System.out.println(grade);
                break;
            case 8:
                grade = "AB";
                System.out.println(grade);
                break;
            case 7:
                grade = "BB";
                System.out.println(grade);
                break;
            case 6:
                grade = "BC";
                System.out.println(grade);
                break;
            case 5:
                grade = "CD";
                System.out.println(grade);
                break;
            case 4:
                grade = "DD";
                System.out.println(grade);
                break;
            default:
                grade = "fail";
                System.out.println(grade);
                break;
        }
    }

}
