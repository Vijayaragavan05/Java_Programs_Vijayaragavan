package Arrays;
/*3.Nurikabe logical game (sometimes called Islands in the Stream) is a binary determination puzzle.
The puzzle is played on a typically rectangular grid of cells, some of which contain numbers.
You must decide for each cell if it is white or black (by clicking on them) according to the following rules:
•	All of the black cells must be connected.
•	Each numbered cell must be part of a white island of connected white cells.
•	Each island must have the same number of white cells as the number it contains (including the numbered cell).
•	Two islands may not be connected.
	There cannot be any 2x2 blocks of black cells.

Unnumbered cells start out grey and cycle through white and black when clicked. Initially numbered cells are white in color.

Problem Statement:

Write a program to find the number of white cells in the final configuration of the board, given a valid initial configuration. Below figure is the sample valid initial configuration.

Input format :
The first line of the input is an integer N that gives the number of rows and columns of the grid.

Next N lines will have a valid initial board configuration with N*N cells. Assume that the maximum number in a cell can be 10.

Grey-colored cells are represented by the integer 20 in the matrix representation of the input configuration.

Output format :
The output should display an integer that the number of white cells in the final configuration of the board.

Sample test cases :
Input 1 :
5
20 20 1 20 3
20 20 20 20 20
20 20 20 20 20
20 20 20 20 20
6 20 3 20 20
Output 1 :
13
Input 2 :
4
20 20 1 20
20 20 20 20
8 20 20 20
20 20 20 20
Output 2 :
9
*/
import java.util.*;
public class Array_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if(20!=arr[i][j]){
                    count+=arr[i][j];
                }
            }
        }
        System.out.println(count);
    }
}
