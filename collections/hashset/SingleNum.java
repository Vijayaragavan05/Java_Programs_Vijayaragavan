package collections.hashset;

import java.util.*;
public class SingleNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(scan.nextInt());
        }
        Set<Integer> set1 = new HashSet<>();
        for(int a : set){
            if(!set.contains(a)){
                set.add(a);
            }
            else {
                set1.add(a);
            }
        }
//        for(int i:set){
//
//        }
        System.out.println(set);
        System.out.println(set1);
    }
}
