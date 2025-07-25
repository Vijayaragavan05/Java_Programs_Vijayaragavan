package DynamicArray;

import java.util.*;

public class DP_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        Vector<Integer> arr1 = new Vector<>();
        for(int i=0;i<n;i++){
            arr1.add(scan.nextInt());
        }
//        System.out.println(arr1);
//        arr1.insertElementAt(10,2);
//        LinkedList<Integer> arr2 = new LinkedList<>();
//        for(int i=0;i<n;i++){
//            arr2.add(scan.nextInt());
//        }
//        System.out.println(arr2);
      //int val = arr.get(0);
      //System.out.println(val);
      arr.addAll(arr1);
      //arr.sort(null);
      //arr.sort((Comparator<? super Integer>) arr);
        //int[] array = arr.toArray(new int[]);
        System.out.println(arr);
      //  Collections.sort(arr);
    }
}
