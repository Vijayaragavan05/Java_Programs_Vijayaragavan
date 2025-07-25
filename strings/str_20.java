package strings;
/*20.Captilize each word in a sentence*/

import java.util.*;
public class str_20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = "";
        String word[] = str.split(" ");
        for(String ch : word){
            str1+=ch.toUpperCase();
        }
        System.out.println(str1+" ");
    }
}
