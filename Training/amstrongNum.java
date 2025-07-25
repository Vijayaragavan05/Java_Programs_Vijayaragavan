package Training;

import java.util.*;
public class amstrongNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;
        int dig = String.valueOf(num).length();
        int rem =0;
        while(num!=0){
            int val = num%10;
            rem+=Math.pow(val,dig);
            num/=10;
        }
        if(rem==temp){
            System.out.println("1");
        }
        else{
            System.out.println(rem);
        }
    }
}
