package Leetcode;

import java.util.Arrays;

public class L2574 {
    public static int[] sum(int[] nums,int n) {
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] result = new int[n];
        for (int i = 1; i < n; i++)
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        System.out.println(Arrays.toString(leftSum));

        for (int i = n - 2; i >= 0; i--)
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        System.out.println(Arrays.toString(rightSum));

        for (int i = 0; i < n; i++)   result[i] = Math.abs(leftSum[i] - rightSum[i]);
        return result;
    }
//    int[] arr = new int[nums.length];
//    int sum =0;
//        for(int i =0;i<nums.length;i++){
//        sum+=nums[i];
//        arr[i]=sum;
//    }
//    sum =0;
//        for(int i=nums.length-1;i>=0;i--){
//        sum+=nums[i];
//        arr[i]=Math.abs(arr[i]-sum);
//    }
//        return arr;

    public static void main(String[] args) {
        int nums[] ={10,4,8,3};
        int n = nums.length;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sum(nums,n)));
    }
}