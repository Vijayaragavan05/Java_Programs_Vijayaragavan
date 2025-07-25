package TwoDimensionalArray;
/*Input
1 2 3
4 5 6
7 8 9
Output
Sum of Column 0: 12
Sum of Column 1: 15
Sum of Column 2: 18*/

import java.util.*;
public class Array_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        int sum=0,sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                if(j==0){
                    sum+=arr[i][j];
                }
                if(j==1){
                    sum1+=arr[i][j];
                }
                if( j==2){
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of Column 0:"+sum);
        System.out.println("Sum of Column 1:"+sum1);
        System.out.println("Sum of Column 2:"+sum2);
    }
}
