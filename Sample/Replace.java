package Sample;

import java.util.Scanner;
public class Replace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scan.nextLine();
        int length = str.length();
        if(str.length()>0){
            System.out.println(str.substring(0,1).toUpperCase() + str.substring(1,length-1)/*.toLowerCase()*/+str.substring(length-1,length).toUpperCase());
        }

        //String str1 = str.replace(" ","-");

        //System.out.println(str);
        //System.out.println(str1);
    }
}
