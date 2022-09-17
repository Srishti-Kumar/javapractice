import java.util.*;
  
public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for (int i = 0; i < n; i++) {
      int num = scn.nextInt();
      isPrime(num);
    }    
  }

  public static void isPrime(int num){
    int count = 0;
    for(int div = 2;div*div<=num;div++){
      
      if(num%div == 0){
        count++;
        break;
      } 

    }

    if(count == 0){
      System.out.println("prime");
    } else{
      System.out.println("not prime");
    }
  }
}
  

