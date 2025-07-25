package strings;
/*8.Create a new string with digits followed by letters from given string*/

import java.util.*;
public class str_8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        String str1 ="";
        String str2 ="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                str1+=ch;
            }
            else if(Character.isLetter(ch)){
                str2+=ch;
            }
        }
        System.out.print(str1);
        System.out.print(str2);
    }
}
