package batch02;

import java.util.*;
public class demo1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[] = {1,2,1,2,3};
        int a =0;
        for(int i:arr){
            a^=i;
        }
        System.out.println(a);
    }
}
