package pattern;
import java.util.*;
public class ButterFlyPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j <= 2 * n - i ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j <= 2 * n - i ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}


