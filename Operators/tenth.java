package Operators;

import java.util.Scanner;

/*Write a program to perform bitwise OR operation.
Input Format
Input to get two values n1,n2.
Output Format
The output displays the result after performing bitwise or operation.
Sample Input
78 90
Sample Output
94
*/
import java.util.*;
public class tenth {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int result = n1|n2;
        System.out.println(result);
    }
}
