package Arrays;
/*7.Given an array X with n number of elements, return true if the given array X is sorted else return false.
You may consider multiple positions may be shifted in the array X.
Example 1:
Input: X=[1,2,3,4,5]
Output: true
Example 1:
Input: X=[3,4,5, 1,2,]
Output: true
Example 1:
Input: X=[3,1,2,4,5]
Output: false*/

import java.util.*;
public class Array_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i+1]>arr[i]){
                System.out.println("true");
                break;
            }
            else{
                System.out.println("false");
                break;
            }
        }
    }
}
