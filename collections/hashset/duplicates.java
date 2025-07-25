package collections.hashset;

import java.util.*;
public class duplicates {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Set<Integer> set1 = new HashSet<>();
        boolean dup = false;
        for(int  a : arr){
            if(set1.contains(a)){
                dup=true;
            }
            set1.add(a);
        }
        System.out.println(dup);
    }
}
