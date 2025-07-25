package collections.hashset;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Set<Integer> arr = new HashSet<>();
        Set<Integer> arr1 = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        for(int i=0;i<m;i++){
            arr1.add(scan.nextInt());
        }
        for(int  a : arr){
            if(arr1.contains(a)){
                System.out.println(a);
            }
            set.add(a);
        }
       //hSystem.out.println(set);
    }
}
