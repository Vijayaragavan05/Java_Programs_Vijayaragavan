package Sample;

import java.util.Scanner;
public class demoString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int lettercount = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                lettercount++;
            }
        }
        System.out.println(lettercount);
    }
}
