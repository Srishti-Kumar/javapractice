import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int div = 2;

  while(num > 1){
    if(num % div == 0){
      num = num/div;
      System.out.print(div+" ");
    }else{
      div++;
    }
  }
 }
}
