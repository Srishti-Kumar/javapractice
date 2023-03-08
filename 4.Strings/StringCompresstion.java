import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i=1;i<str.length();i++){
			char cur = str.charAt(i);
			char prev = str.charAt(i-1);

			if(cur!=prev){
				sb.append(cur);
			}
		}

		return sb.toString();		
	}

	public static String compression2(String str){
		// write your code here
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		int count =1;
		for(int i=1;i<str.length();i++){
			char cur = str.charAt(i);
			char prev = str.charAt(i-1);

			if(cur!=prev){
				if(count >1)
					sb.append(count);
					count = 1;
				sb.append(cur);
			}else{
				count++;
			}
		}
		if(count>1)
			sb.append(count);
			count = 1;

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
