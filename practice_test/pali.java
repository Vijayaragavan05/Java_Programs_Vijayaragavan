package practice_test;

import java.util.*;
public class pali {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int rev =0;
        int og = num;
        while(num>0)
        {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10;
        }
        System.out.println(rev);
        if(og==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
