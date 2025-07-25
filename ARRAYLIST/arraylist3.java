package ARRAYLIST;

//missing element
import java.util.*;
public class arraylist3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(scan.nextInt());
        }
        int exp =0;
        int getting =0;
        for(int i=0;i<=n;i++){
            exp^=i;
        }
        for(int i:list1){
            getting^=i;
        }
        System.out.println(exp-getting);
//        int avg=0,sum=0,diff=0;
//        int i=0;
//        for(int j=i+1;j<n;j++){
//            sum=list1.get(i)+list1.get(j);
//            i++;
//        }
//        avg=
//        avg/=n;
//        diff=sum-avg;
//        //for(int i=0;i<n)
//        System.out.println(diff);
    }

}
