package Sample;

import java.util.Scanner;
public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Two numbers to perform:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        //if()
        calculator(a,b, scan);

    }

    public static void calculator(int a, int b, Scanner scan) {

        while (true) {

            System.out.println("\nCalculator:");
            System.out.println("1. Addition: ");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication:");
            System.out.println("4. Division: ");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    int sum=a+b;
                    System.out.println("Addition of two numbers:"+sum);
                    break;
                case 2:
                    int sub=a-b;
                    System.out.println("Subtraction of two numbers:"+sub);
                    break;
                case 3:
                    int mul=a*b;
                    System.out.println("Multiplication of two numbers:"+mul);
                    break;
                case 4:
                    int div=a/b;
                    System.out.println("Division of two numbers:"+div);
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Thank You!!!");
            }

        }
    }
}