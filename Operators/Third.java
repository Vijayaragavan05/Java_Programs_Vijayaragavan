package Operators;
/*Find the total customers
Jeevan is running a sports club. He already had N number of customers and due to the offer that he declared yesterday a lot of new members have joined the club today. Your task here is to write a program to fi nd the total number of customers that he has.
Question Instructions:
        1.Create a driver class named Sample.Main.
        2.The solution code should be written inside the main method() of the Sample.Main class
Input Format
                N1 denotes the customers that he already has N2 denotes the customer added today separated by a space.
Output Format
The output prints the total number of customers that Jeevan has.
        Constraints
Integers only.
Sample Input
10 11
Sample Output
21
Sample Input
4 5
Sample Output
9*/



import java.util.*;
public class Third {
    public static void Hello(int N1, int N2){
        System.out.println("Total Customers : "+ (N1+N2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Already Exiting customers : ");
        int N1 = scan.nextInt();
        System.out.print("Today added customers : ");
        int N2 = scan.nextInt();
        Hello(N1,N2);
    }
}
