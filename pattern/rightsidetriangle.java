package pattern;

import java.util.Scanner;
import java.util.*;
public class rightsidetriangle {
         public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            for (int i = 1;i<=n;i++){
                System.out.print(" ");
                for (int j=1;j<=n-i;j++){

                for(int k=1;k<=2*i-1;k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
