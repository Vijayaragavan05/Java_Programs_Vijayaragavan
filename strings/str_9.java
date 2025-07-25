package strings;
/*9.Create a new string after removing all spaces in given string*/

import java.util.*;
public class str_9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = str.replace(" ","");
        System.out.println(str1);
    }
}
