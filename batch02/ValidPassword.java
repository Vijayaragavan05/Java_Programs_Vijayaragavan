package batch02;

import java.util.*;
public class ValidPassword {
    public static void main(String[] args) {
        int arr[] = {2,0,2,0};

        List<Integer> receiveOtp = new ArrayList<>();
        for(int i:arr){
            receiveOtp.add(i);
        }
        Collections.shuffle(receiveOtp);

        List<Integer> sentotp = new ArrayList<>();
        for(int i:arr){
            sentotp.add(i);
        }
        for(int i=0;i<50;i++){
            Collections.shuffle(sentotp);
            System.out.println(receiveOtp+" "+sentotp);
            if(sentotp.equals(receiveOtp)){
                System.out.println("Login Successfull");
            }
            else{
                System.out.println("OTP not match");
            }
        }
    }
}
