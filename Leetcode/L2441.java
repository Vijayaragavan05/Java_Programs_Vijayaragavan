package Leetcode;

import java.util.*;

public class L2441 {
    public static void main(String args[]){
        int arr[] = {-1,2,-3,3};
        HashSet<Integer> set = new HashSet<>();
//        for(int n : arr){
//            set.add(Math.abs(n));
//        }
//        int max=0;
//        for(int num:set){
//            if(num>max){
//                max=num;
//            }
//        }
//        System.out.println(max);


//        int max=-1;
//        for(int n : arr){
//            if(set.contains(-n)){
//                max=Math.max(max,Math.abs(n));
//            }
//            set.add(n);
//        }
//        System.out.println(max);
        int max =-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==0){
                    max = Math.max(max,Math.abs(arr[i]));
                }
            }
        }
        System.out.println(max);
    }

}
