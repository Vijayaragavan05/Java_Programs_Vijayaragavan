package batch02;

import java.util.*;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String s1 =scan.nextLine();
       String s2 = scan.nextLine();
        String s = s1+s2;
        if(s.contains(s2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
