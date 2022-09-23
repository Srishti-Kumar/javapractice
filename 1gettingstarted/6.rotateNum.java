import java.util.*;
   
  public class Main{
   
    public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int k = sc.nextInt();
     int temp = num;
     int dig = 0;

     while(temp > 0){
       temp = temp/10;
       dig++;
     }

     
     k = k % dig;
     if(k<0){
       k = k + dig;
     }
     
     int div=1,mul = 1;
      for(int i=0;i<dig;i++){
        if(i<k){
          div = div*10;
        }else{
          mul = mul*10;
        }
      }

      int x = num%div; //84
      int y = num/div; //5629

      System.out.println(x*mul+y);
    }
  }
