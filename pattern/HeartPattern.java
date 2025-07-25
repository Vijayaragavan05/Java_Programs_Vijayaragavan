package pattern;
import java.util.*;

public class HeartPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rows = 2;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }

            System.out.print("   ");


            for (int j = 1; j <= rows-i ; j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

