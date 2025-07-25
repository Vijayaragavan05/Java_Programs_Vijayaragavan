package oopS;
/*.Problem Statement:
Write a program to implement the following logic using inheritance.
Create a parent class and implement the fun method. In the method, get the individual digits of the entered number,
store it in an array, and find their sum.
For example in case of 1234, the individual digits are 4,3,2,1 and the final sum → (4+3)+(4+2)+(4+1)+(3+2)+(3+1)+(2+1) = 30.
Create the main class that inherits the parent class and call the fun method inside the parent function.

Input Format
The input consists of an integer.
Output Format
The output prints the final sum.
Constraints
Integers only.
Sample Input
1234
Sample Output
30*/

import java.util.*;
class parent3{
    void fun(int num){
        int temp=num,count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int arr[] = new int[count];
        temp=num;
        for(int i=0;i<count;i++){
            arr[i]=temp%10;
            temp/=10;
        }
        int sum=0;
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                sum+=arr[i]+arr[j];
            }
        }
        System.out.println(sum);
    }
}
public class prbm_9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        parent3 obj = new parent3();
        obj.fun(n);
    }
}
