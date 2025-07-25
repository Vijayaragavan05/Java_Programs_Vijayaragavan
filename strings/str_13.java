package strings;
/*13.Print Each word in separate line from the given sentence*/

import java.util.*;
public class str_13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] str1= str.split("\\s");
        for(String word:str1){
            System.out.println(word);
        }
    }
}
