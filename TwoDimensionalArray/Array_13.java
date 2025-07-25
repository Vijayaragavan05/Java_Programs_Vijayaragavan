package TwoDimensionalArray;
/*Input
1  0  0
4  5  0
7  8  9

Output
The given matrix is a lower triangular matrix.
*/

import java.util.*;
public class Array_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][n];
        boolean isMatrix = true;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                    if (arr[i][j]!= 0) {
                        isMatrix = false;
                        break;
                    }
                }
            if(!isMatrix){
                break;
            }
        }
        if(isMatrix){
            System.out.println("The given matrix is a lower triangular matrix.");
        }
        else {
            System.out.println("The given matrix is NOT a lower triangular matrix.");
        }
    }
}
