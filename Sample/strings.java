package Sample;

import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scan.nextLine();
        System.out.println(str);
      //  String str1 = String.valueOf(new  StringBuilder(str).reverse());
        // System.out.println(str1);
        String reversed = "" ;
        for ( int i=str.length()-1; i>=0 ;i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
        for(int i=0;i<reversed.length();i++){
            for(int j=0;i<str.length();j++){
                if(i==j){
                    System.out.println("Palindrome");
                }
                else{
                    System.out.println("Not a palindrome");
                }
            }
        }
        /*if(str.equals(reversed)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }*/
    }
}
