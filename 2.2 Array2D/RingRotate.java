import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int s = sc.nextInt();
        int r = sc.nextInt();  
        ringRotate(arr,s,r);
        display(arr);
    }

    public static void ringRotate(int[][] arr,int s,int r){
        int[] shellArray = fillShellArray(arr,s);
        rotate(shellArray,r);
        fillShellArrayinMatrix(arr,s,shellArray);
    }


    public static void fillShellArrayinMatrix(int[][] arr,int s,int[] shellArray){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int index = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = shellArray[index];
            index++;
        }

        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            arr[i][j] = shellArray[index];
            index++;
        }

        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            arr[i][j] = shellArray[index];
            index++;
        }

        for (int i = minr, j = maxc - 1; j > minc; j--) {
            arr[i][j] = shellArray[index];
            index++;
        }
    }

    public static int[] fillShellArray(int[][] arr,int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int size = 2*(maxc-minc) + 2*(maxr-minr);

        int[] shellArray = new int[size];

        int k=0;
        for(int i=minr,j=minc;i<=maxr;i++){
            shellArray[k]=arr[i][j];
            k++;
        }

        for(int i=maxr,j=minc+1;j<=maxc;j++){
            shellArray[k]=arr[i][j];
            k++;
        }

        for(int i=maxr-1,j=maxc;i>=minr;i--){
            shellArray[k]=arr[i][j];
            k++;
        }

        for(int i=minr,j=maxc-1;j>minc; j--){
            shellArray[k]=arr[i][j];
            k++;
        }   
        
        return shellArray;
    }

    public static void rotate(int[] shellArray,int r){
        int n = shellArray.length;
        r = r%n;
        if(r<0){
            r = r+n;
        }
        reverse(shellArray,0,n-r-1);
        reverse(shellArray,n-r,n-1);
        reverse(shellArray,0,n-1);
    }

    public static void reverse(int[] shellArray,int low, int high){
        while(low<high){
            int temp = shellArray[low];
            shellArray[low] = shellArray[high];
            shellArray[high] = temp;
            low++;high--;
        }
    }



    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    

}
