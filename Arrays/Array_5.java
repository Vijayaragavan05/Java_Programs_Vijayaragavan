package Arrays;
/*5.Given an array A consists of N number of elements.If the sum of the element is "even" print the sum of the element.
If the sum of the element is "odd" print the product of the element.

Input format :
The first line of input contains the number of elements N

The second line of input represents the elements A1, A2, A3 . . . . . AN

Output format :
Prints the desired result

Sample test cases :
Input 1 :
5
1 2 3 4 6
Output 1 :
16*/

import java.util.*;
public class Array_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int sum =0;
        int prod =1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            prod*=arr[i];
        }
        if(sum%2==0){
            System.out.println(sum);
        }
        else{
            System.out.println(prod);
        }
    }
}
