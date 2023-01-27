import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int minc = 0;
        int minr = 0;
        int maxr = n-1;
        int maxc = m-1;

        int num = n*m;
        int a = 0;

        while(a<num){
            //left col
            for(int i=minr,j = minc;i<=maxr && a<num;i++){            
                System.out.println(arr[i][j]);
                a++;
            }

            //floor
            minc++;
            for(int i =maxr,j=minc;j<=maxc && a<num;j++){
                
                System.out.println(arr[i][j]);
                a++;
            }

            maxr--;
            for(int j = maxc,i = maxr;i>=minr && a<num;i--){
                System.out.println(arr[i][j]);
                a++;
            }

            maxc--;
            for(int i = minr,j=maxc;j>=minc && a<num;j--){
                System.out.println(arr[i][j]);
                a++;
            }
            minr++;
        } 

    }

}
