package ARRAYLIST;
//collections
import java.util.*;
public class arraylist4 {
    public static void main(String args[]){
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(10,2,2,5,7,20));
        System.out.println(list3+"\n");

        Collections.sort(list3);
        System.out.println("Sorting "+list3);

        Collections.reverse(list3);
        System.out.println("rev "+list3);
        ;
        System.out.println("Max "+Collections.max(list3));

        System.out.println("Min "+Collections.min(list3));

        Collections.rotate(list3,3);
        System.out.println("Rotate right "+list3);

        Collections.rotate(list3,-2);
        System.out.println("Rotate left "+list3);

        System.out.println("Frequency "+Collections.frequency(list3,7));

        Collections.replaceAll(list3,10,17);
        System.out.println("Replace "+list3);

        Collections.swap(list3,1,5);
        System.out.println("Swapping "+list3);

        Collections.shuffle(list3);
        System.out.println("Shuffle "+list3);

        List<Integer> dup= new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
        Collections.copy(dup,list3);
        System.out.println("Duplicates "+dup);

        Collections.fill(dup,100);
        System.out.println("Duplicates1 "+dup);

        Collections.sort(list3);
        System.out.println(list3);

        System.out.println("Index "+Collections.binarySearch(list3,17));

        List<Integer> unchange = Collections.unmodifiableList(list3);
        System.out.println(unchange);
        unchange.add(50);
        //System.out.println(list3);
    }
}
