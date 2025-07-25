package Arrays;
import java.util.*;
public class DynamicArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //int arr[] = new int[n];
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            arr.add(scan.nextInt());
//        }
//        arr.add(2,3);
//        System.out.println(arr);
        Vector<Integer> arr1 = new Vector<>();
        for(int i=0;i<n;i++){
            arr1.add(scan.nextInt());
        }
        arr1.insertElementAt(10,2);
        System.out.println(arr1);
    }
}
