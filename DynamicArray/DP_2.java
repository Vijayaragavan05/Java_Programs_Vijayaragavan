package DynamicArray;

// left rotate array
import java.util.*;
public class DP_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        //Collections.rotate(arr,2);
//        Collections.rotate(arr,3);
//        System.out.println(arr);
        ArrayList<Integer> arr1 = new ArrayList<>();
            int temp = arr.get(0);
            for(int j=0;j<n-1;j++) {
                arr1.add(arr.get(j + 1));
            }
            arr1.add(arr.get(0));
        System.out.println(arr1);
    }

}

