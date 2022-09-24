import java.util.*;
  
  public class Main {
  
  	public static void main(String[] args) {
  	  	//   Write your code here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		int n1 = 0,n2 = 0;

		if(a>b){
			if(a>c){
				max = a;
			} else{
				max = c;
			}
		} else {
			if(b>c){
				max= b;
			}
		}

		if(a==max){
			n1 = b;
			n2 = c;
		} else if(b==max){
			n1 = a;
			n2 = c;
		} else{
			n1 = a;
			n2 = b;
		}
		System.out.println(pythagoran(n1,n2,max));
  	}


	public static boolean pythagoran(int b,int p,int h){
		if(h*h == b*b + p*p){
			return true;
		} else{
			return false;
		}
	}
}
