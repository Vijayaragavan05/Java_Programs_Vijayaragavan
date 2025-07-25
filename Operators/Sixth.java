package Operators;
/*Problem Statement:
Pranav and Change
Pranav, an enthusiastic kid visited the "Fun Fair 2017" along with his family. His father wanted him to purchase entry tickets from the counter for his family members.
Being a little kid, he is just learning to understand units of money.
Pranav has paid some amount of money for the tickets but he wants your help to give him back the change of Rs. N using the minimum number of rupee notes.
Consider a currency system in which there are notes of seven denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.
If the change is given to Pranav Rs. N is input, write a program to computer smallest number of notes that will combine to give Rs. N.
        Input Format
The first line of the input is an integer N, the change to be given to Pranav.
        Output Format
The output should display the smallest number of notes that will combine to give N.
Refer sample input and output for formatting specifications.
        Constraints
Do not use any looping structures.
Sample Input
1200
Sample Output
12
Sample Input
242
Sample Output
7*/

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int notes100 = N/100;
        N%=100;
        int notes50 = N/50;
        N%=50;
        int notes10 = N/10;
        N%=10;
        int notes5 = N/5;
        N%=5;
        int notes2 = N/2;
        N%=2;
        int note1 = N;

        int totalNotes = notes100+notes50+notes10+notes5+notes2+note1;
        System.out.println(totalNotes);
    }
}
