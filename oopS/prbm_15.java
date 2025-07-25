package oopS;
/*Problem Statement:
Create a base class named operationsBase with the following four virtual functions void addition()
void subtraction() void multiplication() void division()
Create a derived class named operationsDerived that extends operationsBase with a and b as its private attributes and override
the virtual functions.

Input Format
The input consists of two integers.
Output Format
The output prints the results of addition, subtraction, multiplication, and division separated by a space.
Sample Input
20 10
Sample Output
30 10 200 2*/

import java.util.*;
class operationsBase{
    private int a;
    private int b;
    void addition() {}
    void subtraction() {}
    void multiplication(){}
    void division(){}
}
class operationsDerived extends operationsBase{
    
    void addition( int a,int b ) {
        System.out.println(a+b);
    }
    void subtraction(int a ,int b) {
        System.out.println(a-b);
    }
    void multiplication(int a ,int b){
        System.out.println(a*b);
    }
    void division(int a ,int b){
        System.out.println(a/b);
    }
}
public class prbm_15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        operationsDerived obj = new operationsDerived();
        obj.addition(a,b);
        obj.subtraction(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);
    }

}
