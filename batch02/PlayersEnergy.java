package batch02;

import java.util.*;
public class PlayersEnergy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[]={10,4,3,17,11,5};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]/=2;
            }
            System.out.println(arr[i]>=5?i+" alive":i+" Dead");
        }

    }
}
