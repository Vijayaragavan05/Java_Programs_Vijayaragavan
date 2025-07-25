package batch02;

import java.util.*;
public class subArray {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int arr[] = {1,1,1};
        int n = arr.length;
        int tar =5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum =0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                 //   if(sum==tar){
                       // System.out.println(arr[k]);
                    //}
                }
//                list.add(sum);
//                for(int num:list){
//                    if(num==tar){
//                        System.out.println("yes");
//                    }
//                    else {
//                        System.out.println("no");
//                    }
//                }
                System.out.print(sum+" ");
            }
        }
    }
}
