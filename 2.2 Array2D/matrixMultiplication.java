import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int m1 = sc.nextInt();
    int[][] arr1 = new int[n1][m1];
    for(int i =0;i<n1;i++){
        for(int j =0;j<m1;j++){
            arr1[i][j] = sc.nextInt();
        }
    }

    int n2 = sc.nextInt();
    int m2 = sc.nextInt();
    int[][] arr2 = new int[n2][m2];
    for(int i =0;i<n2;i++){
        for(int j =0;j<m2;j++){
            arr2[i][j] = sc.nextInt();
        }
    }

    if (m1 != n2) {
      System.out.print("Invalid input");              //3
      return;
    } 
    
    int[][] arr3 = new int[n1][m2];
    for(int i =0;i<arr3.length;i++){
        for(int j =0;j<arr3[0].length;j++){
            for(int k =0;k<m1;k++){
                arr3[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
    }


    for(int i =0;i<arr3.length;i++){
        for(int j =0;j<arr3[0].length;j++){
            System.out.print(arr3[i][j]+" ");
        }
        System.out.println();
    }

 }

}
