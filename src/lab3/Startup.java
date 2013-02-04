package lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 *
 * @author Dawn Bykowski
 * @version 1.00
 */
public class Startup {

    public static void main(String[] args) {
        double minBalance = 50.00;
        double currentBalance = 5000.00;
        int acctNum = 47899;
        String lastName = "Meyers";
        String firstName = "Susan";

        // Create scanner object to hold the user input
        Scanner input = new Scanner(System.in);
        
        // Create a SavingsAccount object
        BankAccount savingsAccount =
                new SavingsAccount(minBalance, currentBalance, acctNum, lastName, 
                firstName);

        System.out.println("Enter deposit amount: ");
        double dAmount = input.nextDouble();
        savingsAccount.deposit(dAmount);
        savingsAccount.getAccountBalance();
        System.out.println("Current balance after deposit: " 
                + savingsAccount.getAccountBalance());

        System.out.println("Enter withdrawal amount: ");
        double wAmount= input.nextDouble();
        savingsAccount.withdrawl(wAmount);
        savingsAccount.getAccountBalance();
        System.out.println("Current balance after withdrawl: "
                + savingsAccount.getAccountBalance());

        System.out.println(savingsAccount);
    }
}
