package Sample;

import java.util.Scanner;

public class FactorialWithoutrecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  number:");
        int n = scan.nextInt();
        int fact = factorial(n);
        System.out.println(fact);

    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
}
