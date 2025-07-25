package Data_Structure;

import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        String str = "ccaaa";
        Map<Character,Integer>  freq = new HashMap<>();
        for(char ch : str.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        System.out.println(freq);
        
    }
}
