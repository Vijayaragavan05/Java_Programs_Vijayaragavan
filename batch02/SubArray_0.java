package batch02;

import java.util.*;
public class SubArray_0 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[]={1,2,-2,4,8,-6,3,-1,2};
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];

                }
                list.add(sum);
                if(sum==0){
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k]+" ");
                    }
                }
            }
        }
        System.out.println(list);
    }
}
