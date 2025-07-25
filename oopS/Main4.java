package oopS;
//polymorphism
//function overloading


import java.util.*;
public class Main4 {

    static class calc{
        public int add(int x){
            return x+100;
        }
        public float add(float x, float y){
            return  x+y;
        }
    }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a= scan.nextInt();
            float b= scan.nextFloat();
            float c = scan.nextFloat();
            calc obj = new calc();
            System.out.println( obj.add(a));
            System.out.println(obj.add( b, c));
        }
    }

