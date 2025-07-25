package strings;
/*7.Create a new string containing only UPPERCASE from given string*/

import java.util.*;
public class str_7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 ="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
                if(Character.isUpperCase(ch)){
                    str1+=ch;
                }
        }
        System.out.println(str1);
    }
}
