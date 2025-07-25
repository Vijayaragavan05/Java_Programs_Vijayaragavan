package oopS;
/*
class
object
constructor
 */
public class example {
    private int x =500;
    public void display(){
        System.out.println("Vijay");
    }
    example() {
        int num1=10,num2=20;
        System.out.println(num1+num2);
    }
    example(int x,int y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        example obj = new example();
        example obj1 = new example(10,20);
        obj.display();
        System.out.println(obj.x);
    }
}
