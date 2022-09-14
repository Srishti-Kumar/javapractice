package com.PatternQuestions;

public class invertedNumHalfPyramid {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for(int i=row;i>=1;i--){
            for(int j=1;j<=column;j++){
                if(j<=i){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}


//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
