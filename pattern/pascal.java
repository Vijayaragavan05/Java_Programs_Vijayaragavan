package pattern;

import java.util.*;
public class pascal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+"  ");
                num = num *(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
