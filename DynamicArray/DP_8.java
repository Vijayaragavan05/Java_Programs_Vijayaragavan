package DynamicArray;

import java.util.HashSet;
import java.util.Scanner;

// difference of two array 
public class DP_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
    }
}
