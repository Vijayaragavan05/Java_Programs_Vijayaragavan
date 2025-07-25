package Sample;

import java.util.Scanner;
public class Score {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        char c = scan.next().charAt(0);
        if(n >=1 && n<= 9) {
            if (c == 'r') {
                System.out.print((n + 5));
            } else if (c != 'r') {
                System.out.print(n);
            }
        }
        else {
            System.out.print("Invalid input");
        }

    }
}
