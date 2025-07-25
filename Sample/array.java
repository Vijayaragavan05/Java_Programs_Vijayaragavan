package Sample;

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the elements for array1:");
        int size1 = scan.nextInt();
        int[] arr = new int[size1];
        long startTime = System.nanoTime();
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the elements for array2:");
        int size2 = scan.nextInt();
        if(size1 == size2){
        int[] arr1 = new int[size2];
        for (int j = 0; j < size2; j++) {
            System.out.print("Enter " + (j + 1) + " element : ");
            arr1[j] = scan.nextInt();
        }

        int[] add = new int[size1];

        for (int i = 0; i < size1; i++) {
            add[i] = arr[i] + arr1[i];
        }
        for (int i = 0; i < size1; i++) {
            System.out.println(add[i]);
        }
    }
        else{
            System.out.println("Array size is not Similar");
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken "+ (endTime - startTime) / 1000000 +"ms");
    }

    public static class Banking {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int Balance = 100000;
            int pin = 2005;
            int attempts = 3;
            System.out.println("Welcome to Our Bank!!");
            //long start = System.nanoTime();
            while (attempts > 0) {
                System.out.println("Enter your4-digit Pin:");
                int enterPin = scan.nextInt();
                if (enterPin == pin) {
                    System.out.println("Login Successfully...!");
                    atmMenu( Balance, scan);
                    return;
                } else {
                    attempts--;
                    System.out.println("Incorrect PIN. Attempts left: " + attempts);
                }
            }

            System.out.println("Too many failed attempts. Your card is blocked.");
            scan.close();
        }

        public static void atmMenu(int balance, Scanner scan) {
            while (true) {

                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");

                System.out.print("Choose an option: ");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1: // Check Balance
                        System.out.println("Your current balance is: ₹" + balance);
                        break;

                    case 2: // Withdraw Money
                        System.out.print("Enter the amount to withdraw: ₹");
                        int withdraw = scan.nextInt();

                        if (withdraw > balance) {
                            System.out.println("Insufficient funds.");
                        } else if (withdraw <= 0) {
                            System.out.println("Invalid amount.");
                        } else {
                            balance -= withdraw;
                            System.out.println("You have withdrawn ₹" + withdraw);
                            System.out.println("Remaining balance: ₹" + balance);
                        }
                        break;

                    case 3: // Deposit Money
                        System.out.print("Enter the amount to deposit: ₹");
                        int deposit = scan.nextInt();

                        if (deposit <= 0) {
                            System.out.println("Invalid amount.");
                        } else {
                            balance += deposit;
                            System.out.println("You have deposited ₹" + deposit);
                            System.out.println("Updated balance: ₹" + balance);
                        }
                        break;

                    case 4: // Exit
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
               }
              }
          }
}
