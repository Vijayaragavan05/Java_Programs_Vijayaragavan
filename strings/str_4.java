package strings;
/*4.Print only lowercase of character in given  string*/

import java.util.*;
public class str_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                System.out.println(ch);
            }
        }
    }
}
