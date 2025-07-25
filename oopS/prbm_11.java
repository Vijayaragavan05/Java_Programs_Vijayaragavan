package oopS;
/*Write a program defining 3 functions with the same name "calc" which performs the mathematical operations of Square, Modulus, and Division.

●	Function for Square takes in one integer argument and returns an integer value
●	Function for Modulus takes 2 integer arguments and returns an integer value
●	Function for Division takes 2 floating-point arguments and returns and float value

Input Format
Single line input has 2 integer values and 2 floating-point values separated by a space.
Note: First input for Square function: First two inputs for modulus function and last two inputs for division function
Output Format

The output displays the result of the operations in separate lines as shown in the sample test cases.
Sample Input
-8 -6 -5 2.0365
Sample Output
Square of -8: 64
Modulus of -8, -6: -2
Quotient of -5, 2.0365: -2.46*/

import java.util.*;
class main{
    void calc(int n ){
        System.out.println("Square of "+ n+":" +(n*n));
    }
    void calc(int n , int m){
        System.out.println("Modulus of "+ n +","+ m +":"+(n%m));
    }
    void calc(float a , float b){
        System.out.printf("Quotient of "+a+","+b+": %.2f",(a/b));
    }
    
}
public class prbm_11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        main obj = new main();
        obj.calc(n);
        obj.calc(n,m);
        obj.calc(a,b);
    }
}
