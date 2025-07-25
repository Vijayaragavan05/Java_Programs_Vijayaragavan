package Arrays;

/*4.Find largest and smallest number in an array.
Input format :
Input consists of n+1 integer inputs.
First line of the input describes the array size 'n',
Followed by n number of array elements.

Output format :
Output displays the smallest and largest number in the array.

Sample test cases :
Input 1 :
5
12 4 2 5 22
Output 1 :
smallest value: 2
largest value: 22*/

import java.util.*;
public class Array_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int min = arr[0], max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Smallest :" + min);
        System.out.println("Largest :" + max);
    }
}