package MAP;

import java.util.*;

public class HM_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]= scan.nextInt();
        }
        int count=1;

        for(int i:arr ){
            if(map.containsKey(i)){
                map.put(i,count+1);
            }
            else{
                map.put(i,count);
            }
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            int key=m.getKey();
            int val=m.getValue();
            System.out.println(key+" "+val);
        }
    }
}
