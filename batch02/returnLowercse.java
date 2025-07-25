package batch02;

import java.util.*;
public class returnLowercse {
    public static void main(String args[]){
     int arr[] = {2,7,4};
     int n = 181;
     String n1 = "";
     for(int i:arr){
         n1+=i;
     }
        int res = Integer.parseInt(n1)+n;
        List<Integer> list = new ArrayList<>();
        while (res>0){
            int rem = res%10;
            list.add(rem);
            res /= 10;
        }
        Collections.reverse(list);
        System.out.println(list);
            }
}
