package collections.hashset;

import java.util.HashSet;
import java.util.*;
public class hashset1 {
        public static void main(String args[]){
            HashSet<Integer> set = new HashSet<>();
            System.out.println(set);
            set.add(10);
            System.out.println(set);
            set.add(30);
            System.out.println(set);
            set.add(10);
            System.out.println(set);
            set.add(20);
            System.out.println(set);
//        Iterator it = set.iterator();
//        while(it.hasNext()){
//            System.out.println("Val "+it.next());
//        }
            HashSet<Integer> set1 = new HashSet<>();
            set1.add(20);
            set1.add(40);
            set1.add(55);
            set1.add(69);
            System.out.println(set1);
            set1.retainAll(set);
            System.out.println(set1);
        }
    }

