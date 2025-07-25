package Data_Structure;

import java.util.*;
public class consecutives {
    public static void main(String abc[]){
        int arr[] = {1,2,3,4,100,200};
        int max=0;
        Set<Integer> set = new HashSet<>();
        for(int n:arr){
            set.add(n);
        }
        for(int num:set){
            int st = 0;
            if(!set.contains(num-1)){
                st=1;
                while(set.contains(num+1)){
                    num++;
                    st++;
                }
            }
            max=Math.max(max,st);
        }
        System.out.println(max);
    }
}
