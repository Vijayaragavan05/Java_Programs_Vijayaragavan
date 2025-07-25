package practice_test;

import java.util.*;
public class findLargest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int arr[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 max = arr[i][j];
                if(arr[i][j]>max){
                   max=arr[i][j];
                }
            }
            System.out.print(max+" ");
        }
    }
}
