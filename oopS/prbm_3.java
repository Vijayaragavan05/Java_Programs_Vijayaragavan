package oopS;
/*3.Write a program to find the area of the wall. Create a class Wall with the following private attributes
length - double
height - double
Include parameterized constructor Wall(double length, double height) and a method calculateArea() which returns the area of the wall.
 In the main method get the length and breadth of two walls from the user.
 */
import java.util.*;
class Wall{
    private double length;
    private double height;
    Wall(double length,double height){
        this.length = length;
        this.height = height;
    }
    public void area(){
        System.out.println(length*height);
    }
}

public class prbm_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int h = scan.nextInt();
        Wall obj = new Wall(l,h);
        obj.area();

    }
}
