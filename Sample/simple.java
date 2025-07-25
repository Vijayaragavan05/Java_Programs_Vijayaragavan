package Sample;


import java.util.*;
public class simple {
    public static boolean contain(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int val : nums){
            if(hs.contains(val)){
                return true;
            }
            hs.add(val);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        System.out.println(contain(nums));
    }
}
