package batch02;

import java.util.*;
public class SubarrayPalindrome {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String arr[]={"race","ma","car","hill","am"};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                String str = arr[i]+arr[j];
                //isPali(str);
                if(isPali(str)) {
                    System.out.println(str + " is Palidrome");
                }
//                else{
//                    System.out.println(str +" Not palindrome");
//                }
            }
        }
    }
    public static boolean isPali(String str) {
        //str=str.trim();
//        String temp = "";
//        for(int i=str.length()-1;i>=0;i--){
//            temp+=str.charAt(i);
//            if(temp.equals(str)){ //
//                return true;
//            }
//        }
//        return false;

        //two pointer method

         int n = str.length();
         int start =0;
         int end = n-1;
         while(start<end){
             if(str.charAt(start)==str.charAt(end)){
                 start++;
                 end--;
                 continue;
             }
             else{
                 return false;
             }
         }
         return true;
    }

}
