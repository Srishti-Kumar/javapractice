package com.PatternQuestions;

public class binaryHalfTriangle {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(j<=i){
                    int num  = i+j;
                    if(num % 2 == 0){
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}


//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1 
