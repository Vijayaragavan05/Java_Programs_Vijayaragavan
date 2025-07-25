package Data_Structure;

import java.util.*;
public class removeChar {
    public static void main(String args[]){
        String str = "lee*cod*e";
        int n = str.length();
        Stack<Character> stk = new Stack<>();
//        for(int i=0;i<n;i++){
//            stk.push(str.charAt(i));
//            if(stk.peek()=='*'){
//                stk.pop();
//                stk.pop();
//            }
//        }

        for(int i=0;i<n;i++){
            if(str.charAt(i)=='*'){
                stk.pop();
            }
            else{
                stk.push(str.charAt(i));
            }
        }
        String ans ="";
        for(char ch : stk){
            ans+=ch;
        }
        System.out.println(ans);
    }
}
