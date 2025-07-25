package strings;
/*15.print the first 2 letters of each word in a sentence*/

import java.util.*;
public class str_15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.print(str.charAt(0)+" ");
        System.out.println(str.charAt(1));

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==' '){
                System.out.println(str.charAt(i+1)+" "+ str.charAt(i+2));
            }
        }
    }
}
