package Training;

import java.util.*;
public class Findsubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        boolean b = true;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)==str1.charAt(0)){
                    if(str.charAt(i)==str1.charAt(j)){
                        b=false;
                    }
                }
            }
        }
        if(b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
