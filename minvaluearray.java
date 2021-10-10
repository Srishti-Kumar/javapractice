/*
Write a program that reads an array of integers and finds the minimum value of the array.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

An integer number representing the minimum in the input array.
Sample Input 1:

5
5 1 4 2 3
Sample Output 1:

1
Sample Input 2:

3
-1 -2 -3
Sample Output 2:

-3
*/

import java.util.*;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] element = new int[size];
        for (int i = 0; i < size; i++) {
            element[i] = scanner.nextInt();
        }
        Arrays.sort(element);
        System.out.println(element[0]);
        
    }
}


