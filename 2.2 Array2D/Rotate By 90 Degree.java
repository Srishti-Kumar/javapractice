import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        display(arr);

    }

    public static void display(int[][] arr){
        for(int j = 0; j < arr.length; j++){
            for(int i = arr[0].length-1;i>=0;i--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
