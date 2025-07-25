package oopS;

/*create a parent class implement the fun methods
in the method get the individuals of the entered num and store it in a array and find sum
create the main class that inherit the  */

import java.util.*;
class parent1{
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    int arr1[]= new int[n];
    public void fun(){
        int num = scan.nextInt();
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }

}
public class Main5 {
    public static void main(String[] args) {
        parent1 obj = new parent1();
        obj.fun();
    }
}
