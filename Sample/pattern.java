package Sample;

import java.util.Scanner;
public class pattern {

    //public class Hollowpattern {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number:");
            int n = scan.nextInt();

            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    //int m = 5;
                    if(i==0 || j==0 ||i==n-1 ||j==n-1||i==j||i+j==n-1) {
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }

                }
                System.out.println("  ");

            }

        }

    }


