package batch02;

import java.util.*;

public class leaderElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = {8,16,1,2,5,7,4,2};
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int max = 0;
            for(int j=i+1;j<arr.length;j++){
                max = Math.max(max,arr[j]);
            }
            ans[i]=max;
        }
        System.out.println(Arrays.toString(ans));
    }
}
