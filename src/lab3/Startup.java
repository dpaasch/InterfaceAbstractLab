package lab3;

import java.util.Scanner;

/**
 * After re-reading the DIP document, I am still struggling as to how
 *
 * @author      Dawn Bykowski
 * @version     1.00
 */
public class Startup {
    
    public static void main(String[] args) {
        
        // Create scanner object to hold the user input
        Scanner input = new Scanner(System.in);

        // Request the annual interest rate, the starting balance, and the 
        // number of months that have passed since the account was established.
        System.out.println("Enter the amount of the Deposit.");
        double amount = input.nextDouble();
        System.out.println("Enter the amount of the Withdrawl.");
         amount = input.nextDouble();
        
        // Create a BankAccount object
        BankAccount savingsAccount = new SavingsAccount(321, "Bykowski", "Dawn", 5000.00);
        
        savingsAccount.setAccountID(555);
        savingsAccount.setLastName("Bykowski");
        savingsAccount.setFirstName("Dawn");
        savingsAccount.setAccountBalance(5000.00);
        savingsAccount.deposit(amount);
        savingsAccount.withdrawl(amount);
        System.out.println(savingsAccount);

    }
        
}
