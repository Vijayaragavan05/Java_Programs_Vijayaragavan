package Arrays;

/*10.Given an array of integers X with n number of elements and an integer, target T, return the indices of the numbers such that the sum of the two numbers is equal to target T.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return answers in order.
Example 1:
Input: X = [2,7,11,15] , T = 9
Output: [0,1]
Example 2:
Input: X = [3,2,4], T = 6
Output: [1,2]*/

import java.util.*;
public class Array_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int t = scan.nextInt();
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=arr[i]+arr[i+1];
            if(sum==t){
                System.out.println("["+i+","+(i+1)+"]");
            }
        }
    }
}
