package batch02;

import java.util.*;
public class findfactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //This one method

//        for(int i=0;i<n/2;i++){
//            if(n==Math.pow(2,i)){
//                System.out.println("Yes");
//                return;
//            }
//        }
//        System.out.println("No");


        //this one method

//        if(n>0 && (n&(n-1))==0){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }


        //this one method
        if(Integer.bitCount(n)==1){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
