package DynamicArray;

import java.util.*;

public class DP_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr1[i]=arr[i];
                count++;
            }
        }
        for (int j=0;j<n;j++) {
            if (j < count) {
                arr1[j] = arr[j];
            } else {
                arr1[j] = arr[j];
            }
        }
        for (int i=0;i<n;i++) {
            System.out.println(arr1[i]);
        }
    }
//    public static int loop(int n){
//        for (int i=0;i<n;i++){
//            a
//        }
//    }
}
