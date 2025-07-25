package Data_Structure;

import java.util.*;

public class SortStringArray {
    public static void main(String args[]){
        String str[] = {"apple","aeroplane","zebra","azeel"};
//        Arrays.sort(str);
//        System.out.println(Arrays.toString(str));
        Set<String> set = new HashSet<>();
        for(String ch : str){
            set.add(ch);
        }
        System.out.println(set);
    }
}
