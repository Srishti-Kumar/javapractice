import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    // write your code here
    int n = a.length;
    if(k==0 || k==n){
      return;
    } else if(k>n){
      k = k % n;
    } else {
      reverse(a,0,n-k-1);
      reverse(a,n-k,n-1);
      reverse(a,0,n-1);
    }       
  }

  public static void reverse(int[] a, int low,int high){
    // write your code here
    while(low<high){
      int temp = a[low];
      a[low] = a[high];
      a[high] = temp;

      low++;high--;
    }

  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
