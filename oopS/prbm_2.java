package oopS;
/*2.Write a Java program that prints a welcome message and a hello message using two different classes Message and Hello, each with a default constructor that outputs a specific message.
 Input Format
  No console Input
 Output Format
  The Output Should display the Welcome Message
 Sample Input
 Sample Output
  Welcome Hello*/

class welcome {

    welcome() {
        System.out.print("WELCOME\t");
    }
}
    class hello{
        hello(){
            System.out.println("HELLO");
        }
    }
public class prbm_2 {
    public static void main(String[] args) {
        welcome ob = new welcome();
        hello obj = new hello();
    }
}
