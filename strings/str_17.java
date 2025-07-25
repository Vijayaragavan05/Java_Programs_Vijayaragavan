package strings;
/*17.Print only the 3 letter word in a sentence*/

import java.util.*;
public class str_17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] word = str.split(" ");
        for(String ch : word){
            if(ch.length()==3){
                System.out.println(ch);
            }
        }
    }
}
