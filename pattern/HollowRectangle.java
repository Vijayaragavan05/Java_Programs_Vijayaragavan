package pattern;
import java.util.*;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int m = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1|| j==1|| i==n || j==m ) {
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
