package Brute_force;

import java.util.*;
public class subStringMatch {
    public static void main(String abc[]){
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        String pat = scan.next();
        int lenT = text.length();
        int lenP = pat.length();

        for(int i=0;i<lenT-lenP;i++){
            int j;
            for(j=0;j<lenP;i++){
                if(text.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==lenP) System.out.println(i);
        }
        System.out.println(lenT);
    }
}
