package Arrays;
import java.util.*;
public class SecondLarg {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        long str = System.currentTimeMillis();
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int lar = arr[0];
        for(int i=0;i<n;i++){
            if(lar<arr[i]){
                lar=arr[i];
            }
        }
        int secL= -1;
        for(int i=0;i<n;i++){
            if(arr[i]>secL && arr[i]!=lar){
                secL=arr[i];
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(secL);
        System.out.println((end-str) +"ms");
    }
}
