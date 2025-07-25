package collections.treeset;

import java.util.*;
public class treeset1 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(20);
        t1.add(30);
        t1.add(25);
        System.out.println(t1);
        System.out.println(t1.first());
        System.out.println(t1.last());
        System.out.println(t1.higher(20));
        System.out.println(t1.lower(30));
    }
}
