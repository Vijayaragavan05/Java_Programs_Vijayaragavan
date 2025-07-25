package Recursion;

public class Fibonacci {

    public static long fib(long x,int arr){
        if(x==0)
            return 0;
        if(x==1)
            return 1;
        return fib(x-1,arr)+fib(x-2,arr);
    }
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        int a =50;
        int arr[] = new int[a+1];
        System.out.println(fib(a,arr[5]));
        long et = System.currentTimeMillis();
//        long st = System.currentTimeMillis();
//        System.out.println(fib(50));
//        long et = System.currentTimeMillis();
        System.out.println("Executed time :"+(et-st));
    }
}
