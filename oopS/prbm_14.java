package oopS;
/*Alphabetics Game:
You have to enter four letters for each uppercase letter you will get 10 marks and for each lowercase letter, you will get -5 marks.
Write a program to calculate the total score.
Create a base class with a virtual method void game(). Define this method in the Derived class and calculate the total score.
Input Format
Input consists of four characters separated by space.
Output Format
The output prints the total score.
Sample Input
A B Z X
Sample Output
40
*/
import java.util.*;
class base{
    int score=0;
    public void game(char ch[]){
        for(char c : ch){
            if(Character.isUpperCase(c)){
                score+=10;
            }
            else{
                score-=5;
            }
        }
        System.out.println(score);
    }
}


public class prbm_14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char ch[] = new char[n];
        for(int i=0;i<n;i++){
            ch[i]=scan.next().charAt(0);
        }
        base obj = new base();
        obj.game(ch);
    }
}
