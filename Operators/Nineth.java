package Operators;

/*Ramu and Somu are going on a picnic. Ramu packs m apples, n oranges. Somu packs
m1 more apples than Ramu and n1 more oranges than Ramu. If Somu eats x of his apples and Ramu eats y of Somu's oranges, how many apples and oranges are left in total?
Input Format

Input consists of 6 integers m,n,m1,n1,x,y.
1.m - corresponds to the apples brought by Ramu.
2.n - corresponds to the oranges brought by Ramu.
3.m1 – Apples brought by Somu.
4.n1 – Oranges brought by Somu.
5.x - apples ate by Somu.
6.y – oranges ate by Ramu.
Output Format
Print two integers representing remaining apples and oranges.
Sample Input
4 3 2 8 3 2
Sample Output
7 12*/

import java.util.*;
public class Nineth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int m1 = scan.nextInt();
        int n1 = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int balanceA = m+m+m1-x;
        int balanceB = n+n+n1-y;
        System.out.println(balanceA + " "+ balanceB);
    }
}
