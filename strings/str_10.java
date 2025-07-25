package strings;
/*10.Reverse the case of each character in given string*/

import java.util.*;
public class str_10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            System.out.print(ch+" ");
        }
    }
}
