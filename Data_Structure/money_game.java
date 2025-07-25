package Data_Structure;

import java.util.*;
public class money_game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =4;
        int bal = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int outcome = scan.nextInt();
            bal +=outcome;
            min = Math.min(min,bal);
        }
        System.out.println(-(min));
    }
}
