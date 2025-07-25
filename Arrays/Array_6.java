package Arrays;
/*6.Given N balls of colour red, white or blue arranged in a line in random order.
You have to arrange all the balls such that the balls with the same colours are adjacent with the order of the balls, with the order of the colours being red, white and blue (i.e., all red coloured balls come first then the white coloured balls and then the blue coloured balls).

Input Format
single integer array size N. N number of array values
Constraints
1<=N<=100
Output Format
output array value

Sample Input 0
5
0 1 0 2 1
Sample Output 0
0 0 1 1 2*/

import java.util.*;

public class Array_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }

        for(int i=0;i<n;i++) {
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
