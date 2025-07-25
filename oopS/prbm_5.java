package oopS;
/*
5.An ice-cream vendor sells his ice-creams in cone(radius r and height h) and ball(radius r) shaped containers.
However, he is unsure of the quantity that can be filled in the two containers. You are required to write a program in java that prints the volume of the containers given its respective dimensions as input.
Your class must be named ‘Icecream’ which has two methods with same name ‘Quantity’ each having the respective dimensions of the containers as the parameters.
Function Header:
public void Quantity(int r, int h)
public void Quantity(int r)
Input Format
If the quantity of the cone is to be calculated, the input must have the radius(r) and height(h) in the same line separated by a space.
For calculating the quantity of the ball, the input must have its radius(r).
Note: Input type should be integer.
Output Format
The output must display the volume of the container rounded off to two decimal places for which the dimensions are given.
Sample Input
4 5
4
Sample Output
82.90
267.28
*/

import java.util.*;
class  icecream{
    public void Quantity(double r ,double h){
        System.out.println((1/3.0)*Math.PI*Math.pow(r,2)*h);
    }
    public void Quantity(double r){
        System.out.println((4/3.0)*Math.PI*Math.pow(r,3));
    }

}
public class prbm_5 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int radius = scan.nextInt();
        int height = scan.nextInt();
        icecream obj = new icecream();
        obj.Quantity(radius,height);
        obj.Quantity(radius);
    }
}
