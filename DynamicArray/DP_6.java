package DynamicArray;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class  DP_6 {
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
        // arr1.retainAll(arr);
//        Iterator<Integer> it = arr.iterator();
//        Iterator<Integer> it1 = arr1.iterator();
//        while (it.hasNext()) {
//            int val = it.next();
//            while (it1.hasNext()) {
//                int val1 = it1.next();
//                if (val == val1) {
//                    System.out.print(val);
//                }
//            }
//        }
//        arr1.addAll(arr);
        System.out.println(arr);
//        arr1.addAll(arr);
//        System.out.println(arr1);
    }
}
