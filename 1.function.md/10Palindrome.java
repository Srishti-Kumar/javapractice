import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(palindrome(num));
    }

    //for negatives use stringbuilder
    public static boolean palindrome(int num){
        String a = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.reverse();
        //convert input to string sb.toString();
        String s1 = sb.toString();
        return s1.equals(a);
    }
    //this only works for positive integers fails for
//    public static boolean palindrome(int num){
//        int fnum = num;
//        int rev = 0;
//        while(num != 0){
//            int digit = num % 10;
//            rev = rev*10 + digit;
//            num = num /10;
//        }
//        if (fnum == rev){
//            return true;
//
//        } else {
//            return false;
//        }
//    }
}

//121
//121 % 10 == 1
// rev = rev*10 + 1    => 1       rev = 0
//121 / 10 == 12
//12 % 10 == 2
//rev = rev*10 + 2   => 1*10 + 2 = 12
//12/10 == 1
//1 % 10 == 1
//rev = /rev = rev*10 + 1  => 12*10 + 1 => 121
