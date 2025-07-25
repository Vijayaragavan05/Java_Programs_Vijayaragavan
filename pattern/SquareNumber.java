package pattern;
import java.util.*;
public class SquareNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-i;j++) {
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++) {
                System.out.print(" "+a*a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
