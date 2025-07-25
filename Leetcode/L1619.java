package Leetcode;

import java.util.*;
public class L1619 {
    public static void main(String abc[]){
        Scanner scan = new Scanner(System.in);
       // int []arr = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3));
        int min=0,max=0;
        for(int n:list){
            if(n<min){
                min=n;
            }
            else{
                max=n;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

}
