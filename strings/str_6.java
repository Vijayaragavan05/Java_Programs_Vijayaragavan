package strings;
/*6.Print Count of UPPER & lower case of given String*/

import java.util.*;
public class str_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count1 =0;
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
            else{
                count1++;
            }
        }
        System.out.println(count);
        System.out.println(count1);
    }
}
