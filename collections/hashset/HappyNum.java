package collections.hashset;

import java.util.*;
public class HappyNum {
    public static boolean happyORnot(int num) {

    Set<Integer> set = new HashSet<>();
    while(num>1&&set.contains(num))
    {
        set.add(num);
        num=Value(num);
    }
    if(set.contains(num)){
        return false;
    }
    return true;
}
    public static int Value(int n){
        int dig=0,val=0;
        while(n>0){
            dig= n%10;
            val += (dig)*(dig);
            n/=10;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(happyORnot(num));
    }
}
