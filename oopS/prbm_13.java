package oopS;



/*Write a program to find that whether the given number(x) is even or odd if it is even then print the cube(x)+square(x) else print cube(x)-square(x).
Create a base class with a virtual function void print(). print the result by implementing this virtual function in the derived class.

Input Format
The input consists of an Integer.
Output Format
The output prints the result.
Sample Input
5
Sample Output
100*/
import java.util.Scanner;
class number {
        public int  Num(int num){
        int sum=0;
        if(num%2==0){
            sum= ((num*num*num)+(num*num));
            return sum;
        }
        else
        {
        sum= ((num * num * num) - (num * num));
        return sum;
        }
    }
}
class number1 extends number{
    public void print(int num){
        System.out.println(Num(num));
    }
}
public class prbm_13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        number1 obj = new number1();
        obj.print(n);
    }
}
