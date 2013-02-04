package lab3;

import java.text.DecimalFormat;

/**
 * Which super classes should be concrete vs. abstract vs. Interface? Justify
 * your choices by adding comments to each class. This super class contains
 * actions that will not perform all the actions found within the Account interface,
 * therefore this class will be declared as an abstract class rather than an
 * abstract class.
 *
 * @author Dawn Bykowski
 */
public abstract class BankAccount extends AccountManager implements Account {

    // These properties will be inherited by the sub-classes and will be defined
    // here.
    private double accountBalance;          // acount balance
    private static double interestRate;     // interest rate

    // Constructor calls the abstract superclass constructor.
    public BankAccount(double accountBalance, int accountID, String lastName, 
            String firstName) {
        super(accountID, lastName, firstName);
        this.accountBalance = accountBalance;
    }

    // Accessor & Mutator Methods: These include the 3 methods found in the 
    // Account interface
    // Setting the deposit and withdrawl methods to final, so they cannot be
    // overridden within the SavingsAccount sub-class.
    public final void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdrawl(double amount) {
        if (amount < this.getAccountBalance()) {
            accountBalance -= amount;
        } else {
            System.out.println("Error. You do not have sufficient funds for this"
                    + " transaction.");
        }
    }

    // Method: toString() shows the state of the object
    @Override
    public String toString() {

        String BankAccountString = super.toString()
                + "\n Account ID: \t" + accountID
                + "\n Last Name: \t" + lastName
                + "\n First Name: \t" + firstName
                + "\n Account Balance: \t" + accountBalance;
        return BankAccountString;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    // Setting this method as final, so it cannot be overridden within the 
    // SavingsAccount sub-class.
    public final void setAccountBalance(double accountBalance) {
        if (accountBalance > 0) {
            this.accountBalance = accountBalance;
        } else {
            System.out.println("Error. Balance cannot be a negative number.");
        }
    }
}
