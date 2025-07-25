package ARRAYLIST;

import java.util.*;
public class arraylist2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list2.add(scan.nextInt());
        }
        System.out.println(list2);
        if(list2.size()==0 || list2.size()==1){
            System.out.println(list2.size());
            
        }
        int k = scan.nextInt();
        Iterator<Integer> it = list2.iterator();
        while(it.hasNext()){
            if(it.next() == k){
                it.remove();
            }
        }
        System.out.println(list2);

//        int i=0;
//        for(int j=i;j<list2.size();j++){
//            if(!list2.get(i).equals(list2.get(j))){
//                i++;
//                list2.set(i,list2.get(j));
//            }
//        }
//        while(list2.size()>i+1) {
//            list2.remove(list2.size()-1);
//        }
//        System.out.println(list2);
    }
}
