package oopS;
/*8.Write a java program that creates an abstract class called "Shape". This class should have the following methods:
abstract void rectangleArea();
abstract void squareArea();
abstract void circleArea();
Then, create a class called "Area" that extends the "Shape" class. This class should calculate and print the area of all shapes.
Finally, create a Main class that gets the inputs and passes them to the appropriate methods.

Input Format
The first line of the input consists of the length and breadth.
The second line consists of the side.
The third line consists of the radius.
Output Format
The output prints the area of a rectangle, square, and circle.

Sample Input
10 20
4
5
Sample Output
200
16
78.54*/

abstract class Shape{
    abstract void rectangleArea(int  l ,int  b);
    abstract void squareArea(int a);
    abstract void circleArea(double r);
}
class Area extends Shape{
    @Override
    void rectangleArea(int  l, int b) {
        System.out.println(l*b);
    }
    void squareArea(int a){
        System.out.println(a*a);
    }

    @Override
    void circleArea(double r) {
        System.out.printf("%.2f",Math.PI*r*r);
    }
}

public class prbm_8 {
    public static void main(String[] args){
        Area obj = new Area();
        obj.rectangleArea(10,20);
        obj.squareArea(4);
        obj.circleArea(5);
    }

}
