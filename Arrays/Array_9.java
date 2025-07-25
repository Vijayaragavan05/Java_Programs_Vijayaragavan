package Arrays;
/*9.Given an array X with n size having digits from 0 to 9. find and display missing digits from the array.

Input1: n=4; x= [1,4,3,8]
output1: 0  2 5  6  7 //missing digits from the array.
 */

import java.util.*;
public class Array_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //int m = scan.nextInt();
        int arr[] = new int[n];
        int[] arr1= {0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<n;i++){
            //j++;
            if(arr[i]!=arr1[j]){
                System.out.print(j);
                i--;
            }
            j++;
        }
    }
}

