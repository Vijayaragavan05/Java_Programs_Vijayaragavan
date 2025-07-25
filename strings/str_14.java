package strings;
/*14.print the first letter of each word in a sentence*/

import java.util.Scanner;

public class str_14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] str1= str.split("\\s");
        for(String word:str1){
            char ch = word.charAt(0);
            System.out.println(ch);
        }
    }
}
