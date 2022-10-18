import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arrn = new int[n];
    for(int i=0;i<arrn.length;i++){
        arrn[i] = sc.nextInt();
    }

    int m = sc.nextInt();
    int[] arrm = new int[m];
    for(int i=0;i<arrm.length;i++){
        arrm[i] = sc.nextInt();
    }

    int[] arrk = new int[n > m? n : m];
    int c = 0;

    int i = arrn.length-1;
    int j = arrm.length-1;
    int k = arrk.length-1;

    while(k >= 0){
        int d = c;

        if(i >=0){
            d += arrn[i]; 
        }

        if(j >=0){
            d += arrm[j];
        }

        c = d/10;
        d = d%10;

        arrk[k] = d;

        i--;
        j--;
        k--;
    }

    //printing

    if(c != 0){
        System.out.println(c);
    }

    for(int val: arrk){
        System.out.println(val);
    }
}


}
