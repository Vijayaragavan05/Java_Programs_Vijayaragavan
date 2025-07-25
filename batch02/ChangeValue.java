package batch02;

import java.util.*;

public class ChangeValue {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = String.valueOf(n);
        String S = str.replaceFirst("6", "9");
        System.out.println(S);
    }
}
