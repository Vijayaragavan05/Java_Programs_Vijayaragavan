package pattern;

import java.util.*;
public class Xpattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n= scan.nextInt();
        //int m = scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
