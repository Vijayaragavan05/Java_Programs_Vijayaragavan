package TwoDimensionalArray;
/*Input
8  6
5  9

3  2
1  4

Output
5 4
4 5*/

import java.util.Scanner;

public class Array_12 {
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
                arr[i][j] -= arr1[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
