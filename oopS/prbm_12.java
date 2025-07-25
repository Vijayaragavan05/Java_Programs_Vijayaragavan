package oopS;
/*.Function Overloading
Write a program to implement function overloading.
Ram is given two or three inputs as an integer, if he has two integers then add the two numbers. If he has three inputs, then multiply the three numbers.
Function Header:
public void fun1(int a,int b,int c) public void fun1(int a,int b)
Input Format
First-line represents the number of elements(N) followed by the elements separated by a single space. If the number of the elements exceeds 2 or 3,
then display a message as Invalid Input.
Output Format
Display the sum, if there are two integers or Displays product, if there are three integers.
Constraints
N > 0 and N < 4
Sample Input
3
1 2 3
Sample Output
6*/

import java.util.*;
class Hello{
    public void fun1(int a , int b, int c){
        System.out.println(a*b*c);
    }
    public void fun1(int a , int b){
        System.out.println(a+b);
    }
}
public class prbm_12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Hello obj = new Hello();
        if(n>3){
            System.out.println("Invalid Input");
        }
        else if(n==3){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            obj.fun1(a, b, c);
        }
        else{
            int a = scan.nextInt();
            int b = scan.nextInt();
            obj.fun1(a, b);
        }
    }
}
