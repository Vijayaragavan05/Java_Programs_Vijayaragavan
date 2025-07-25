package strings;
/*12.Create a word encoding program which moves each letter by 2
Example A becomes C,B becomes D,Y becomes a so on.,*/

import java.util.*;
public class str_12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = "";
        for(int i=0;i<str.length();i++){
            str1+=(char) (str.charAt(i)+2);
        }
        System.out.println(str1);
    }
}
