/*
Write a program that reads an array of ints and an integer number n.

The program must check how many times n occurs in the array.

Input data format
The first line contains the size of the input array.

The second line contains elements of the array separated by spaces.

The third line contains n.

Output data format

The result is only a single non-negative integer number.

 Report a typo
Sample Input 1:

6
1 2 3 4 2 1
2
Sample Output 1:

2
Sample Input 2:

9
1 2 3 4 5 4 3 2 1
7
Sample Output 2:

0
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numofElement = new int[size];
        for (int i = 0; i < size; i++) {
            numofElement[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        int count = 0;
        for (int j = 0; j < size; j++) {
            if (numofElement[j] == num) {
                count++;
            } 
        }
        System.out.println(count);
        
        
    }
}
