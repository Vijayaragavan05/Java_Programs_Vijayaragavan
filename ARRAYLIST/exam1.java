package ARRAYLIST;
//day01
import java.util.*;
public class exam1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(3,40);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        int a = list1.get(1);
        System.out.println(a);
        list1.add(40);
        list1.add(50);
        list1.toArray();
        System.out.println(list1.size());
        System.out.println(list1.contains(80));
        System.out.println(list1.isEmpty());
        System.out.println(list1.getFirst());
        System.out.println(list1.clone());
        System.out.println(list1.reversed());
    }
}
