package pattern;

import java.util.Scanner;

public class Vpattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n*2;j++){
                if(i==j || i+j==n*2){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
