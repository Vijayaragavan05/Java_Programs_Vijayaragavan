package Arrays;
import java.util.*;
public class twoDimentional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //int arr[][] = new int[n][n];
        int m = scan.nextInt();
        int arr[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        //System.out.println(Arrays.toString(arr));
        /*for(int i =0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/

        /*for(int i =0;i<n;i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

        /*for(int i =0;i<m;i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }*/
        /*int sum=0;
        for(int i =0;i<n;i++) {
            for (int j = 0; j <m; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);*/


        /*int min = arr[0][0];
        for(int i =0;i<n;i++) {
            for (int j = 0; j <m; j++) {
                if(arr[i][j]<min){
                    min =arr[i][j];
                }
            }
        }
        System.out.println(min);*/

        int sum=0;
        for(int i =0;i<n;i++) {
            for (int j = 0; j <m; j++) {
                if(i==j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
