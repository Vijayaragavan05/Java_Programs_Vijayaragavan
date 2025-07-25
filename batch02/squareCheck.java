package batch02;

import java.util.*;

public class squareCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sq = (int) Math.pow(n,2);
        System.out.println(sq);
        int rem =0;
        while(n>0){
            int dig = n%10;
            rem = (rem * 10) + dig;
            n/=10;
        }
        int sq1 = (int) Math.pow(rem,2);
        System.out.println(sq1);
        int rem1 =0;
        while(sq1>0){
            int dig = sq1%10;
            rem1=(rem1*10)+dig;
            sq1/=10;
        }
        if(rem1==sq){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
