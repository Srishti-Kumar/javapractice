/*Write a program that calculates the sum of the elements of an array of ints.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

The sum of the input array elements.
 Report a typo
Sample Input 1:

3
1 2 3
Sample Output 1:

6
Sample Input 2:

5
-1 0 1 2 -2
Sample Output 2:

0
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] elements = new int[size]; //array 
        int sum = 0;
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
            sum = sum + elements[i];
        }
        
        System.out.println(sum);     
    }
}
