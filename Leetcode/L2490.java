package Leetcode;

import java.util.*;
public class L2490 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s ="leetcode exercises sound delightful";

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(s.charAt(i-1)==s.charAt(i+1))
                {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");

    }
}
