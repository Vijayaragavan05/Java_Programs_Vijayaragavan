package batch02;

public class maxSubarray {
    public static void main(String args[]){
        int arr[]={1,4,5,-1,10};
        int cur =arr[0],max=arr[0];
        for(int i=1;i<arr.length;i++){
            cur = Math.max(arr[i],cur+arr[i]);
            max=Math.max(max,cur);
        }
        System.out.println(cur);
    }
}
