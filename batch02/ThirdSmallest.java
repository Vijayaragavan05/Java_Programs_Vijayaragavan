package batch02;

import java.util.*;
public class ThirdSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] ={1,3,2,4};
        int sum=0;
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                count++;
            }
            if(count==3){
                System.out.println(sum);
            }
        }
    }

}
