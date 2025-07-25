package Operators;
/** Write a program to print the power of m raised to n.
 Input Format
 The input consists of the m and n values.
 Output Format
 The output prints the result.
 Note: Round off the output to two decimal places.
 Sample Input
 2 3
 Sample Output
 8.00
 Sample Input
 3 4
 Sample Output
 81.00**/

import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of m :");
        int m = scan.nextInt();
        System.out.print("Enter the value of n :");
        int n = scan.nextInt();
        double res = Math.pow(m,n);
        System.out.println(res);

        double result =1;
        for (int i=1;i<=n;i++){
            result*=m;
        }
        System.out.println(result);
    }
}

