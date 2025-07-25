package batch02;

import java.util.*;
public class example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        boolean asc = false;
        boolean desc = false;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                asc = true;
                break;
            }
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                desc= true;
                break;
            }
        }
        System.out.println(asc && desc?"Yes":"No");
    }
}
