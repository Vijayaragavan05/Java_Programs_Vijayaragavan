package Operators;
/*Trade Fair
Trade Fairs are important for companies to present their products and to get in touch with its customers and business parties.
 One such grandeur Trade Fair Event was organized by the Confederation of National Large Scale Industry.
Number of people who attended the event on the fi rst day was
x
. But as days progressed, the event gained good response and the number of people who attended the event on the second day was twice the number of people who attended on the fi rst day.
 Unfortunately due to heavy rains on the third day, the number of people who attended the event was exactly half the number of people who attended on the fi rst day.
Given the total number of people who have attended the event in the fi rst 3 days, fi nd the number of people who have attended the event on day 1, day 2 and day 3.
Input Format
First line of the input is an integer value that corresponds to the total number of people.
Output Format
First line of the output should display the number of attendees on day 1.
Second line of the output should display the number of attendees on day 2.
Third line of the output should display the number of attendees on day 3.
Sample Input
10500
Sample Output
Number of attendees on day 1 : 3000
Number of attendees on day 2 : 6000
Number of attendees on day 3 : 1500*/

import java.util.*;
public class Seventh {
    public static void main(String[] args) {
        System.out.print("Enter the total no.of attenders : ");
        Scanner scan = new Scanner (System.in);

        int totalAttendance = scan.nextInt();
        int day1 = (2*totalAttendance)/7;
        int day2 = day1*2;
        int day3 = day1/2;

        System.out.println("First day attended people : " +day1);
        System.out.println("Second day attended people : "+day2);
        System.out.println("Third day attended people : "+day3);
    }
}
