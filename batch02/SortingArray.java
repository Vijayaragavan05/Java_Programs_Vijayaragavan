package batch02;

import java.util.*;
public class SortingArray {
    public static void main(String args[]){
        int arr[] ={1,-4,2,3,-8,-2};

        //int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
