package oopS;
import java.util.*;
class calc{
    public void add(int x){
        System.out.println(x+100);
    }
    public void add(int x,int y){
        System.out.println(x+y);
    }
}
public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        calc obj = new calc();
        obj.add(a);
        obj.add(a,b);
    }
}
