package Arrays;
/*1.Mukesh and his friends have set out on a vacation to Coorg. They have booked accommodation in a resort and the resort authorities organize Campfires every night as a part of their daily activities.
Mukesh volunteered himself for an activity called the "Adjacent Stick Game" where sticks of different lengths will be placed in a line and Mukesh needs to remove a stick from each adjacent pair of sticks.
He then has to form a bigger stick by combining all the remaining sticks.

Mukesh needs to know the smallest length of the bigger stick so formed and needs your help to compute the same.
Given the number of sticks N and the lengths of each of the sticks, write a program to find the smallest length of the bigger stick that is formed.

Input format :
The first line of input contains an integer N denoting the number of sticks. Assume that the maximum value for N is 50.
Assume that N is always even.
The next line of input contains an N integer denoting the length of each of the sticks.
Output format :
Output the smallest length of the bigger stick that is formed.
Sample test cases :
Input 1 :
4
2 1 3 1
Output 1 :
2
Input 2 :
4
2 5 4 1
Output 2 :
3*/

import java.util.*;

public class Array_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int total = 0;
        for (int i = 0; i < n; i+=2) {
            total+=Math.min(arr[i],arr[i+1]);
        }
        System.out.println(total);



        /*int min = arr[0],max=arr[0];
        for(int i=0;i<n;i++){
            if (arr[i]<min) {
                min = arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Smallest :"+ min);
        System.out.println("Largest :"+max);*/


    }
}
