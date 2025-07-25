package Operators;

/**Q1.Write a program to fi nd the square, cube, and square root of a number.
 Input Format
 To get the integer from user.
 Output Format
 Displays the square, cube, and square root of the number. Refer sample output.
 Constraints
 Read Integers input value.
 Input Format
 To get the integer from user.
 Output Format
 Displays the square, cube, and square root of the number. Refer sample output.
 Sample Input
 5
 Sample Output
 Square of 5 is: 25.0
 Cube of 5 is: 125.0
 Square Root of 5 is: 2.23606797749979**/


import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = scan.nextInt();
        float square = n*n;
        float cube = n*n*n;
        double root = Math.sqrt(n);
        System.out.println("Square of "+ n + " is: "+square);
        System.out.println("Cube of "+ n + " is: "+cube);
        System.out.println("Square Root of "+ n + " is: "+root);
    }
}
