package Training;

import java.util.Scanner;

public class BankingATM {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int Balance = 100000;
            int pin = 2005;
            int attempts = 3;
            System.out.println("Welcome to Our Bank!!");

            while(attempts > 0) {
                System.out.println("Enter your4-digit Pin:");
                int enterPin = scan.nextInt();
                if (enterPin == pin) {
                    System.out.println("Login Successfully...!");
                    atmMenu(Balance, scan);
                    return;
                }

                --attempts;
                System.out.println("Incorrect PIN. Attempts left: " + attempts);
            }

            System.out.println("Too many failed attempts. Your card is blocked.");
            scan.close();
        }

        public static void atmMenu(int balance, Scanner scan) {
            while(true) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Your current balance is: ₹" + balance);
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ₹");
                        int withdraw = scan.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Insufficient funds.");
                        } else {
                            if (withdraw <= 0) {
                                System.out.println("Invalid amount.");
                                continue;
                            }

                            balance -= withdraw;
                            System.out.println("You have withdrawn ₹" + withdraw);
                            System.out.println("Remaining balance: ₹" + balance);
                        }
                        break;
                    case 3:
                        System.out.print("Enter the amount to deposit: ₹");
                        int deposit = scan.nextInt();
                        if (deposit <= 0) {
                            System.out.println("Invalid amount.");
                            break;
                        }

                        balance += deposit;
                        System.out.println("You have deposited ₹" + deposit);
                        System.out.println("Updated balance: ₹" + balance);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

