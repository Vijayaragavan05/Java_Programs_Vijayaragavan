package Operators;
/*Alice wanted to start a business and she was looking for a venture capitalist. Through her friend Bob, she met the owner of a construction company who is interested to invest in an emerging business.
Looking at the business proposal, the owner was very much impressed with Alice's work. So he decided to invest in Alice's business and hence gave a green signal to go ahead with the project.
 Alice bought Rs. X for a period of Y years from the owner at R% interest per annum. Find the rate of interest and the total amount to be given by Alice to the owner.
 The owner impressed by the proper repayment of the financed amount decides to give a special offer of 2% discount on the total interest at the end of the settlement.
  Find the amount given back by Alice and also fi nd the total amount. (Note: All rupee values should be in two decimal points).
Sample.Example 1
Input
100
1
10
Output
10.00
110.00
0.20
109.80
Explanation
When we substitute the values of the principal amount, rate of interest, and number of years in the Simple Interest formula we get the output values.
Sample.Example 2
Input
40
1
10
Output
4.00
44.00
0.08
43.92*/

import java.util.*;
public class Eighth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double principal = scan.nextDouble();
        int year = scan.nextInt();
        double rate = scan.nextDouble();

        double interest = (principal*year*rate)/100;
        double totatAmount = principal+interest;
        double discount = interest*0.02;
        double finalAmount = totatAmount-discount;

        System.out.printf("%.2f\n",interest);
        System.out.printf("%.2f\n",totatAmount);
        System.out.printf("%.2f\n",discount);
        System.out.printf("%.2f\n",finalAmount);
    }
}
