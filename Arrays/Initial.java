package Arrays;
import java.util.*;
public class Initial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        //int arr[] ={41,25,66,25};
        /*long[] arr = new long[n];
        for (int i=0;i<n;i++){
            arr[i]= scan.nextLong();
        }
        System.out.println(arr[1]);
        int m=3;
        /*for(int i=0;i<m;i++){
            System.out.println(arr[i]);
        }*/
        int[][] arr1 = new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 arr1 [i][j]= scan.nextInt();
            }
        }
        System.out.println(arr1[1][2]);

    }
}
