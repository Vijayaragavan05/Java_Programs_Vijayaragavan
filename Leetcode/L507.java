package Leetcode;

import java.util.*;
public class L507 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        int sum=0;
        for(int num:list){
            sum+=num;
        }
        if(sum==n){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
