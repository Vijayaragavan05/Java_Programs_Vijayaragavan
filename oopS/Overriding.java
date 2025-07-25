package oopS;

class Bank{
    public double Interest(){
        return 1.0;
    }
}
class Sbi extends Bank{
    public double Interest(){
        return 8.5;
    }
}
class Iob extends Bank{
    public double Interest(){
        return 10.5;
    }
}
public class Overriding {
    public static void main(String[] args) {
        Bank obj = new Bank();
        Bank obj1 = new Sbi();
        Bank obj2 = new Iob();
        System.out.println(obj.Interest());
        System.out.println(obj1.Interest());
        System.out.println(obj2.Interest());
    }
}

/*create a parent class implement the fun methods
in the method get the individuals of the entered num and store it in a array and find sum
create the main class that inherit the  */