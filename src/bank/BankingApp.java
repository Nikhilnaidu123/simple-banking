package bank;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\nWelcome to Simple Banking App");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNumber = scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String accHolderName = scanner.nextLine();
                    account = new BankAccount(accNumber, accHolderName);
                    System.out.println("Account created successfully!");
                    break;
                
                case 2:
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                
                case 3:
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                
                case 4:
                    if (account != null) {
                        System.out.println("\nAccount Details:");
                        System.out.println(account);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                
                case 5:
                    System.out.println("Thank you for using Simple Banking App. Goodbye!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
