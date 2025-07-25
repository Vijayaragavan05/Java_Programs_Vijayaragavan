package practice_test;

import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1 =0,n2=1,sum=0;
        for(int i=0;i<n;i++){
            System.out.print(n1+" ");
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }

    }
}
