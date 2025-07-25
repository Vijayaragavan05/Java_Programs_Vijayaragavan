package oopS;
/*Create a Java class called Vehicle with the following specifications:
The Vehicle class should have a protected string variable named type.
Implement a constructor to initialize the type variable.
Implement a public method named displayType() that prints the value of the type.
Create a subclass of Vehicle called Car with the following specifications:

The Car class should have a private string variable named brand.
Implement a constructor to initialize both the type and brand variables.
Implement a public method named displayBrand() that prints the value of brand.
In the Main class, prompt the user to enter the type and brand of a car. Create an object of the Car class with the
 provided input and display the type and brand of the car using the displayType() and displayBrand() methods
Input Format
The first line of the input should be car type
The second line of the input should be the car brand
 Output Format
Refer to the sample output
Sample Input
Sedan
BMW
Sample Output
Type: Sedan
Brand: BMW*/

import javax.crypto.spec.PSource;
import java.util.*;
class Vehicle {
    protected String type;
    Vehicle(String str){
        type = str;
    }
    public void displayType(){
        System.out.println("Type : "+type);
    }
}
class Car extends Vehicle{
    private String brand;
    Car(String str){
        super(str);
        brand = str;
    }
    public void displayBrand(){
        System.out.println("Brand : "+brand);
    }
}
public class prbm_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        Vehicle ob = new Vehicle(str);
        Car obj = new Car(str1);
        ob.displayType();
        obj.displayBrand();
    }
}
