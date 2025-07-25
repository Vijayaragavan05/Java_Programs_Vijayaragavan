package Data_Structure;
import java.util.*;
public class DuplicateEmail {
    public static void main(String args[]){
        int arr[] = {1,3,3,4,3,3};
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(n-set.size());
    }
}
