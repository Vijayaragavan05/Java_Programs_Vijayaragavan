package oopS.abstaction;

import java.util.*;
abstract class shape{
    double dim1 , dim2;
    shape(double d1 , double d2){
        dim1 =d1;
        dim2 = d2;
    }
    abstract double area();
}
class Rec extends shape{
    Rec(double l,double b){
        super(l,b);
    }
    double area(){
        return dim1*dim2;
    }
}
class circle extends Rec{
    circle(double r){
        super(r,0);
    }
    double area(){
        return Math.PI*Math.pow(dim1,2);
    }
}
public class initial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int b = scan.nextInt();
        int r = scan.nextInt();
        Rec obj1 = new Rec(l,b);
        circle obj = new circle(r);
        System.out.println(obj1.area());
        System.out.println(obj.area());

    }
}
