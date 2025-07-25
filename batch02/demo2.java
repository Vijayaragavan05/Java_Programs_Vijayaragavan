package batch02;

import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = {6,-10,-3,5,9,2,-4};
        Arrays.sort(arr);
        int start = arr[0];
        int end = arr[arr.length-1];
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum=arr[i]+arr[i+1];
        }
    }
}
