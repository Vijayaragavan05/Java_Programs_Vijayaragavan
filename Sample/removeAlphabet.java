package Sample;

import java.util.Scanner;
public class removeAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = scan.nextLine();
        /*String str1 = " ";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                str1 += c;
            }
        }*/
        String str1 = str.replaceAll("[^a-zA-Z]"," ");
        System.out.println(str1);
    }
}
