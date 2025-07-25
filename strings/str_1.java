package strings;
/*1.Print each character in newline from given string*/

import java.util.*;
public class str_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
