package Sample;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  number:");
        int n = scan.nextInt();
        int fact = 1;
        long startTime = System.nanoTime();
        if(n==0 || n==1){
            System.out.println("1");
        }
        else {
            for (int i = n; i >= 1; i--) {
                fact *= i;
            }
            System.out.println(fact);
        }

        long endTime = System.nanoTime();
        System.out.println("\nTime taken: " + (endTime - startTime) + " ns");

        //System.out.println("\nTime taken: " + (endTime - startTime)/1000000 + " ns");
    }
}
