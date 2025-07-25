package strings;
/*19.Count the number of word in a sentence*/

import java.util.*;
public class str_19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count=0;
        String[] word = str.split(" ");
        for(String ch:word ){
            count++;
        }
        System.out.println(count);
    }
}
