package DynamicArray;



import java.util.*;
public class DP_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }

        int rot = 2;
        for(int i=0;i<rot;i++){
            int temp = arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]= arr[j+1];
            }
            arr[n-1]=temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
