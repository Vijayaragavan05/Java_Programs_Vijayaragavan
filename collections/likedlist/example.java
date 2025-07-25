package collections.likedlist;

import java.util.*;
public class example {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<5;i++){
            list.add(scan.nextInt());
        }
        list.addLast(55);
        list.push(25);
        int n =list.peek();
        System.out.println(n);
        System.out.println(list);
    }
}
