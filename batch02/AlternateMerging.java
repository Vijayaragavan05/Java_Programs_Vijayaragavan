package batch02;

import java.util.*;
public class AlternateMerging {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[] ={1,2,3};
        int arr1[]={4,5,6};
        int str = 0;
        int end = arr1.length-1;
        int ans[] = new int[arr.length+arr1.length];
        for(int i=0;i<ans.length;i++){
            if(i%2==0){
                ans[i]=arr[str++];
            }
            else{
                ans[i]=arr1[end--];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
