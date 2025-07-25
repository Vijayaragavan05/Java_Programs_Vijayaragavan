package Operators;
/*If the marks of Alice in 3 subjects are mark1, mark2, mark3. Calculate the total and average.
        Input Format
The input consists of the three subject marks.
Output Format
The output prints the sum and average.
        Note: Round off the output to two decimal places.
Sample Input
96 98 94
Sample Output
Total : 288
Average : 96.00*/

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Subject1 Mark: ");
        int mark1 = scan.nextInt();
        System.out.print("Enter the Subject2 Mark: ");
        int mark2 = scan.nextInt();
        System.out.print("Enter the Subject3 Mark: ");
        int mark3 = scan.nextInt();
        int total = mark1+mark2+mark3;
        System.out.println("Total : "+total );
        float Average = total/3;
        System.out.printf("Average %.2f: "+Average);
    }
}
