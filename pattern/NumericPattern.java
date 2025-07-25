package pattern;
import java.util.*;
public class NumericPattern {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            for(int i = 1;i<2*n;i++) {
                for(int j=1;j<2*n;j++) {
                    System.out.print(Math.max(Math.max(j, i),Math.max(2*n-j, 2*n -i))-(n-1));
                }
                System.out.println();
            }
        }
    }
