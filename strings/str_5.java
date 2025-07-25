package strings;
/*5.print Alphabet count in given string*/

import java.util.*;
public class str_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
