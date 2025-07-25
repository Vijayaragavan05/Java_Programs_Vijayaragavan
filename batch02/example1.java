package batch02;

import java.util.*;
public class example1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
       int sum=0;
       int count=0,avg=0;
       while(true){
           int n = scan.nextInt();

           if(n==-1){
               break;
           }
           else{
               sum+=n;
               arr.add(n);
           }
           count++;
           avg = sum/count;

       }
        System.out.println(sum);
        System.out.println(count);
        System.out.println(avg);
        int mode =0,val=0;
        for(int i=0;i<arr.size();i++){
            int temp =0;
            for(int j=i;j<arr.size();j++){
                if(arr.get(i)==arr.get(j)){
                    temp++;
                }
            }
            if(temp>mode){
                mode = temp;
                val = arr.get(temp);
            }
        }
        System.out.println(val);
    }
}
