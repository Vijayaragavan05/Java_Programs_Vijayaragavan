package strings;

/*11.check given string is Palindrome or not*/

import java.util.*;
public class str_11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 ="";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            str1+=ch;
        }
        if(str1.equals(str)){
            System.out.println("The String is Palindrome");
        }
        else{
            System.out.println("The String is not Palindrome");
        }
    }
}
