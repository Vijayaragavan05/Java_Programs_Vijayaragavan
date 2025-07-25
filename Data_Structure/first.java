package Data_Structure;

import java.util.*;
public class first {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int n = arr.length;
        //int ans[] = new int[n];
        int prv=0;
        List<Integer> list = new ArrayList<>();
        for(int i=k-1;i<n;i+=k){
            rev(arr,prv,i);
            prv=i+1;
        }
        for(int num:arr){
            list.add(num);
        }
        System.out.println(list);
    }
    public static void rev(int arr[], int k, int i){
        while(k<i){
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i]=temp;
            i--;
            k++;
        }
    }
}
