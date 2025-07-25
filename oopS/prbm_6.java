package oopS;
/*.Create a parent class that consists of two methods m1 and m2.
m1 doesn't take any arguments and it just prints from parent.
m2 takes an integer value as parameter and prints the same.
Create a child class that extends parent class and override its methods.
m1 doesn't take any arguments and it just prints from child.
m2 takes an integer value as parameter and prints the same.
In the main class, create objects for the above classes and call the corresponding methods.
Input Format
The input consists of the integer value for both the classes separated by a space.
Output Format
The output displays the result. Refer sample output.
Constraints
integers only.

Sample Input  1 2
Sample Output
From parent m1()
1
From child m1()
2
*/

import javax.xml.transform.Source;

import java.util.*;
class parent2{

    void m1(){
        System.out.println("From parent m1()");
    }
    void m1(int x){
        System.out.println(x);
    }
}
class Child extends parent2{
    void m1(){
        System.out.println("From child m1()");
    }
    void m1(int y){
        System.out.println(y);
    }
}
public class prbm_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        parent2 obj =  new parent2();
        obj.m1();
        obj.m1(a);
        Child ob = new Child();
        ob.m1();
        ob.m1(b);
    }
}
