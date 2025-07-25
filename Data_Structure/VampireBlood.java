package Data_Structure;

import java.util.Arrays;

public class VampireBlood {
    public static void main(String[] args) {
        String str = "093212";
        int n = str.length();
        int arr[]= new int[n];
        int sum=0;
        for(int i=0;i<str.length();i++) {
             arr[i] = str.charAt(i) - '0';
             //sum+=arr[i];
        }
        Arrays.sort(arr);

        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        if(sum<arr[arr.length-1]){
            System.out.println(arr[arr.length-1]);
        }
        else{
            System.out.println(sum);
        }
        //System.out.println(sum);
        System.out.println(Arrays.toString(arr));
    }
}
