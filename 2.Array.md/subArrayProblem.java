import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    int low = 0;
    for(int i=0;i<n;i++){
        tree(arr,n,low);
        low++;
    }

    
 }

 public static void tree(int[] arr,int n,int low) {
     for(int i=low;i<n;i++){
        for(int j=low;j<=i;j++){
            System.out.print(arr[j]);
            System.out.print("\t");
        }
        System.out.println();
    }
 }

}
