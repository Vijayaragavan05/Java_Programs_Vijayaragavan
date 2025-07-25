package strings;
/*2.Print ASCII value for each character in given string*/

import java.util.Scanner;

public class str_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            int ascii = (int) ch;
            System.out.println(ascii);
        }
    }

}
