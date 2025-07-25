package pattern;
import java.util.*;
public class NormalPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                for(int i =1;i<=n;i++){
                    for(int j =1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i =1;i<=n;i++){
                    for(int j=n;j>i;j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i = 0;i<=n;i++){
                    for(int j=0;j<=n-i-1;j++){
                        System.out.print(" ");
                    }
                    for(int j=0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();

                }
                for(int i = 0;i<=n;i++){
                    for(int j=0;j<=i;j++){
                        System.out.print(" ");
                    }
                    for(int j=0;j<n-i;j++){
                        System.out.print("*");
                    }
                    System.out.println();

                }
            }
        }