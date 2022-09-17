import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i=low;i<=high;i++){
            isPrime(i);   
        }

    }
    private static void isPrime(int n) {
        int count=0;
        for(int div = 2;div*div<=n;div++){
            if(n%div==0){
                count++;
                break;
            }
        }
        
        if(count == 0){
            System.out.println(n);
        }

    }
}
