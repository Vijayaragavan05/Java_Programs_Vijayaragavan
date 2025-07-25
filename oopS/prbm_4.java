package oopS;
/*4.SINGLE INHERITANCE
Create a class 'Parent'. 'Parent' class should have a method 'add' which prints the addition of 2 integers.
Create a class 'Child' which should be a child class of 'Parent' class.
'Child' class should have a method 'sub' which prints subtraction of 2 integers. Create an object for a 'Child' class.
Call the 2 methods add and sub from the child class object and display the result.
Example Input
60
34
Output
94
26*/
import java.util.*;
class parent{
    void Add(int x,int y){
        System.out.println(x+y);
    }
}
class child1 extends parent{
    void sub(int x , int y){
        System.out.println(x-y);
    }
}
public class prbm_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        child1 obj = new child1();
        obj.Add(x,y);
        obj.sub(x,y);
    }
}
