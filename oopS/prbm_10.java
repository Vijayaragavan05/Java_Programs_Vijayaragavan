package oopS;
/*Create two functions with the same name "add"
int add(int, int) - that takes two integer inputs as parameters and adds them. float add(float, float) - that takes two float values as parameters and adds them.
In the main method, get the inputs and pass them to the functions.
Input Format
First line contains two integers separated by a space. Second line contains two floating points values separated by a space
Output Format
The output displays the two output values in different lines as shown in the sample test case.
Sample Input
1 2
3.5 4.5
Sample Output
3
8.0*/
import java.util.*;
class Addition {
    void Add(int a ,int b){
        System.out.println(a+b);
    }
    void Add(float a ,float b){
        System.out.println(a+b);
    }
}
public class prbm_10 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int a= scan.nextInt();
        int b =scan.nextInt();
        float a1 = scan.nextFloat();
        float b1 = scan.nextFloat();
        Addition obj = new Addition();
        obj.Add(a,b);
        obj.Add(a1,b1);
    }

}
