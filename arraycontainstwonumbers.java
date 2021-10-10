/*
Write a program that reads an unsorted array of integers and two numbers n and m. 
The program must check if n and m occur next to each other in the array (in any order).

Input data format

The first line contains the size of an array.
The second line contains elements of the array.
The third line contains two integer numbers n and m.
All numbers in the same line are separated by the space character.

Output data format

Only a single value: true or false.
 Report a typo
Sample Input 1:

3
1 3 2
2 3
Sample Output 1:

true
Sample Input 2:

3
2 1 2
2 3
Sample Output 2:

false
*/



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code 
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        boolean occurNextTo = false;
        for (int j = 0; j < size - 1; j++) {
            if (num[j] == n && num[j + 1] == m || num[j] == m && num[j + 1] == n) {
                occurNextTo = true;
                break;
            }
        }
        System.out.println(occurNextTo);
    }
}
