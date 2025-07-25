package DynamicArray;

import java.util.HashSet;
import java.util.Scanner;

// Intersection of two array

public class DP_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        System.out.println(arr);
        HashSet<Integer> arr1 = new HashSet<>();
        for(int i=0;i<n;i++){
            arr1.add(scan.nextInt());
        }
        HashSet<Integer> intersection = new HashSet<>();
        for (Integer element : arr) {
            if (arr1.contains(element)) {
                intersection.add(element);
            }
        }
        System.out.println(intersection);
    }
}
