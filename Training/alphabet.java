package Training;

import java.util.*;
public class alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch1 = scan.next().charAt(0);
        char ch2 = scan.next().charAt(0);
        int diff = (int)ch2-(int)ch1;
        int sum=(int)ch2+diff;
        if(sum>122) {
            sum-=26;
            System.out.println((char) sum);
            //System.out.println(diff);
        }
    }
}
