import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();

    int digits =0;
    while(num != 0){
      num = num / 10;
      digits++;
    }
    System.out.println(digits);

  }
}
