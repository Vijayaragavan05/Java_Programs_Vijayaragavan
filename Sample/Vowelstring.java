package Sample;

import java.util.Scanner;

public class Vowelstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int lettercount = 0;
        String vowels ="aeiouAEIOU";
        for(int i=0; i<str.length() ;i++) {
            /*char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                lettercount++;
            }*/
            if(vowels.indexOf(str.charAt(i))!=-1){
                lettercount++;
            }
        }
        System.out.println(lettercount);
    }
}