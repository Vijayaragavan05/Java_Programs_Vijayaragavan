package strings;
/*3.Print only UPPERCASE of character in given string*/

import java.util.Scanner;

public class str_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.println(ch);
            }
        }
    }
}
