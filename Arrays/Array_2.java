package Arrays;

/*The Pan Am 73 flight from Bombay to New York en route to Karachi and Frankfurt was hijacked by a few Palestinian terrorists at the Karachi International Airport. The senior flight purser Neerja Banhot withered her fear and helped evacuate the passengers on board.
Neerja very well knew that she would not be able to evacuate all passengers dodging the hijackers. So she wanted to hand over the responsibility of evacuating the senior citizens(above 60 years of age) and children(below 18 years of age) in the flight to the mid-aged passengers seated in the diagonal
Given n the number of rows of seats and the number of seats in a row and the ages of passengers in each seat can you find the number of mid-aged passengers seated in the diagonal.

Input format :
The first line input consists of an integer n, corresponding to the number of rows of seats and the number of seats in the aircraft.

The next n lines of input consist of n integers that correspond to the ages of passengers

Output format :
The output consists of an integer corresponding to the number of mid-aged passengers seated in the diagonal.

Sample test cases :
Input 1 :
3
25 17 20
33 26 30
4  7  3
Output 1 :
2
Input 2 :
5
2 30 34 14  18
80 8 36 44  21
20 23 24 25 25
18 18 19 17 28
29 28 10 12 56
Output 2 :
2*/
import java.util.*;
public class Array_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
    int[][] arr1 = new int[n][n];
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr1[i][j]= scan.nextInt();
        }
    }
    System.out.println(Arrays.toString(arr1));
    int count=0;
        for(int i=0;i<n;i++) {
        for (int j = 0; j < n; j++) {
            if(i==j){
                if(18<arr1[i][j] && arr1[i][j]<60 ){
                    count++;
                }
            }
        }
    }
        System.out.println(count);
   }
}


