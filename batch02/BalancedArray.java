package batch02;

import java.util.*;
public class BalancedArray {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[]= {3,4,7,8,23,4,93,18,22};
        int n = arr.length;

        for(int i=1;i<n;i++) {
            if(!(arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0)) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
//        int str = 0;
//        int next = 1;
//        while(n>=0){
//            if(arr[str]%2==0 && arr[str]%2!=0){
//                System.out.println("yes");
//                return;
//            }
//            else if(arr[next]%2==0 && arr[next]%2!=0){
//                System.out.println("no");
//                return;
//            }
//            str+=2;
//            next+=2;
        //}
    }
}
