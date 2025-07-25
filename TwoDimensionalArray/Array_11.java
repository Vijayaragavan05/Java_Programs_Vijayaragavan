package TwoDimensionalArray;

/*M1
1 2
3 4
M2
5 6
7 8

Output
6 8
10 12*/

import java.util.*;
public class Array_11 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][n];
        int arr1[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr1[i][j] = scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr1[i][j] += arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }

}
