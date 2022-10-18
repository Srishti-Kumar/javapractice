import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arrn = new int[n];
    for(int i=0;i<n;i++){
        arrn[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    int[] arrm = new int[m];
    for(int i=0;i<m;i++){
        arrm[i] = sc.nextInt();
    }

    int[] diff = new int[m];
    int c = 0;

    int i = arrn.length-1;
    int j = arrm.length-1;
    int k = diff.length-1;


    while(k >= 0){
        int d = 0;
        int arv = i >= 0? arrn[i]:0; 
        
        if(arrm[j] + c >= arv){
            d = arrm[j] + c - arv;
            c = 0;
        } else {
            d = arrm[j] + c + 10 - arv; 
            c = -1;
        }

        diff[k] = d;

        i--;
        j--;
        k--;
    }

    int index = 0;
    while(index<diff.length){
        if(diff[index] == 0){
            index++;
        } else{
            break;
        }
    }

    while(index<diff.length){
        System.out.println(diff[index]);
        index++;  
    }
 }

}
