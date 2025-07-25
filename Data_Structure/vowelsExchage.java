package Data_Structure;

import java.util.*;
public class vowelsExchage {
    public static void main(String args[]){
        String str = "Cricket";
        String vow = "";
        int ind =0;
        for(int i=0;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))!=-1)  {
                vow=str.charAt(i)+vow;
            }
        }
        System.out.println(vow);
        for(int i=0;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))!=-1)  {
                System.out.print(vow.charAt(ind++));
            }
            else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
