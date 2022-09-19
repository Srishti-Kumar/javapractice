import java.util.*;
    
  public class Main{
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long num = sc.nextLong(); 
      int rem  = 0;
      int dig = 0;
      long temp = num;
      while(temp != 0){
        temp = temp/10;
        dig++; 
      }
      
      int div = (int)Math.pow(10,dig-1);
      for(int i=0;i<dig;i++){
        rem = (int)num/div;
        num = num%div;

        System.out.println(rem);
        div=div/10;
      }
            
    }
  }
