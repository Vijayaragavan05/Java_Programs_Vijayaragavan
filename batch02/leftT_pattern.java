package batch02;

import java.util.*;
public class leftT_pattern {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        for(int i = 0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
