package strings;
/*18.Print the longest word in a sentence*/

import java.util.*;
public class str_18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] word = str.split(" ");
        String longest =" ";
        for(String ch : word){
            if(ch.length()>longest.length()){
                longest=ch;
            }
        }
        System.out.println(longest);
    }
}
