package Data_Structure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class printEven {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        for(int n:arr) System.out.print((n&1)==0?n+" ":"");
        int arr1[] = {1,2,4,2,5,1,3,4,5};
        arr1 = Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr1));
    }
}
