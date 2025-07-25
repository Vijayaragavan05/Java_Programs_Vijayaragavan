package Operators;
/*The Acme Tennis Ball Company is designing a new box to ship its products.
The marketing department wants a triangular box that can hold 4 balls, as in the illustration below.
The balls fi t exactly inside the box, just touching all three walls and the end caps of the container.
All 3 walls of the box are the same size (equilateral triangle). Assume a tennis ball is 6 cm in diameter, and ignore the thickness of the box material.
What will be the length and breadth of the material used to make the box? Write a program that fi nds the measure of a side of the box.
Program must also display the length and breadth of the material used to make the triangular box.
The formula to be applied for the above problem is:
side = sqrt(3)*diameter
        length = side*3
breadth = 4*diameter
Input Format
The input consists of the diameter of the box.
        Output Format
The output displays the side of the box, length and breadth of the material used to make the triangular box separated by a space.
Round off the fl oat values to two decimal places.
Sample Input
Sample Output
6
Side : 10.39
Length : 31.18
Breadth : 24.00*/

import java.util.*;
public class Fifth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Diameter of ball : ");
        double diameter = scan.nextInt();
        double side = Math.sqrt(3)*diameter;
        double length = 3 * side;
        double breadth = 4 * diameter;

        System.out.printf("Side : %.2f\n", side);
        System.out.printf("Length : %.2f\n", length);
        System.out.printf("Breadth : %.2f\n", breadth);
    }
}


