package strings;
/*16.Print the word which starts with only S in a sentence or else -1*/

import java.util.*;
public class str_16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word[] = str.split(" ");
        for(String ch : word) {
            if (ch.charAt(0) == 'S' || ch.charAt(0)=='s') {
                System.out.println(ch);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
