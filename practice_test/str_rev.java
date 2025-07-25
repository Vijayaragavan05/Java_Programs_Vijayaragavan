package practice_test;

import java.util.*;
public class str_rev {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = Integer.toString(n).length();
        for(int i=s;i>=0;i--){
            System.out.print(s);
        }

//        String s = scan.nextLine();
//        for(int i=s.length()-1;i>=0;i--){
//            System.out.print(s.charAt(i)+" ");
//        }
    }
}

