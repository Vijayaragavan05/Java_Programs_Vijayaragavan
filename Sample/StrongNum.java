package Sample;

import java.util.Scanner;
public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(isStrongnum(num)){
            System.out.println(num + " is a Strong Number");
        }
        else{
            System.out.println(num + " is not Strong Number");
        }
    }
    public static boolean isStrongnum(int num){
        int sum =0;
        int temp=num;
        while (temp!=0){
            int digit =temp%10;
            sum+=factorial(digit);
            temp/=10;
        }
        return sum==num;
    }
    public static int factorial(int num){
        int fact =1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}
