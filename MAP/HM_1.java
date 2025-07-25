package MAP;

import java.util.*;
public class HM_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(scan.nextInt(),scan.nextLine());
        }
        //System.out.println(hm);

        hm.put(3,"Orange");
        hm.put(4,"Apple");
//        for(Integer key: hm.keySet()){
//            System.out.println(key+" " + hm.get(key));
//        }
//        for(Map.Entry<Integer,String> val: hm.entrySet()){
//            int key = val.getKey();
//            String value = val.getValue();
//            System.out.println(key+"->" + value+" ");
//        }
    }
}
