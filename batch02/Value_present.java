package batch02;

import java.util.*;
public class Value_present {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[]={1,2,4,6,7};
        int n = 5;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=n){
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
