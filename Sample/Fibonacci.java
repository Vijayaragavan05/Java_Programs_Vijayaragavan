package Sample;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        int num1 =1, num2 =  2;
        long sum =0;
        long productsss=1;
        long startTime = System.nanoTime();
        System.out.println();
       int i=1;
        //while(i<n)
        //for (int i=1; i<n; i++){
           do {
               sum += num1;
               productsss = productsss * num1;
               System.out.print(num1 + " ");
               int num3 = num1 + num2;
               num1 = num2;
               num2 = num3;
               i++;
               //}
           } while(i<n);

        System.out.println();
        System.out.println();
        System.out.println( "The sum of the series is " + sum);
        System.out.println( "The product of the series is " + productsss);
        long endTime = System.nanoTime();
        System.out.println("\nTime taken: " + (endTime - startTime) / 1000000 + " ms");
    }
}