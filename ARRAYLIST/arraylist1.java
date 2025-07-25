package ARRAYLIST;

import java.util.*;
public class arraylist1 {
    public static void main(String args[]){
        //ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3,8,7,1,2));
        //System.out.println(list1);
        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            list1.add(scan.nextInt());
        }
        System.out.println(list1);
        for(int v : list1){
            System.out.println("V :"+v);
        }
        Integer arr[] = list1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

    }
}
