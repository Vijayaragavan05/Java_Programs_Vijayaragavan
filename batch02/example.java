package batch02;


import java.util.*;

public class example {
    public static void main(String[] args) {
        int arr[] = {3,1,2,4,3};
        int n = arr.length;
//        int mindiff = Integer.MAX_VALUE;
//        int tot = Arrays.stream(arr).sum();
//        int left=0;
//        for(int i=0;i<n-1;i++){
//            left+=arr[i];
//            int right = Math.abs(tot-left);
//            mindiff=Math.min(mindiff,Math.abs(left-right));
//        }
//        System.out.println(mindiff);
        int max = Arrays.stream(arr).max().orElse(-1);
        System.out.println(max);
        double avg = Arrays.stream(arr).average().orElse(-1);
        System.out.println(avg);
//        Arrays.stream(arr);
    }
}
