package batch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CheckingGoods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(Arrays.asList("milk","bread","butter","chips","toiletPaper"));
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("milk","soda","bread"));
        for(String S:list){
            if(!list1.contains(S)){
                System.out.println(S+" ");
            }
        }
    }
}
