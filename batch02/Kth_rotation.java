package batch02;

import java.util.*;
public class Kth_rotation {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        int rot = 2;
        for(int i=0;i<rot;i++){
            int temp = arr[n-1];
            for(int j=n-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=temp;
        }
//        int ans[] = new int[n];
//        int ind=0;
//        int rot = scan.nextInt();
//        for(int i=rot;i<n;i++) {
//            ans[ind++]=arr[i];
//        }
//        for(int i=0;i<rot;i++){
//            ans[ind++]=arr[i];
//        }
        System.out.println(Arrays.toString(arr));
    }
}
