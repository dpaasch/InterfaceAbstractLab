package lab3;

/**
 * Which super classes should be concrete vs. abstract vs. Interface? Justify
 * your choices by adding comments to each class. This super class contains
 * actions that will perform all the actions found within the Account interface,
 * therefore this class will be declared as a concrete class rather than an
 * abstract class.
 *
 * @author Dawn Bykowski
 */
public class BankAccount implements Account {

    // BankAccount properties: These properties will be shared with the savings 
    // account class and will only be declared within this super class.
    private int accountID;                  // account number
    private String lastName;                // account owner last name  
    private String firstName;               // account owner first name
    private double accountBalance;          // acount balance
    private static double interestRate;     // interest rate

    // Constructor
    public BankAccount(int accountID, String lastName, String firstName,
            double accountBalance) {
        this.accountID = accountID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.accountBalance = accountBalance;
    }

    // Accessor & Mutator Methods: These include the 3 methods found in the 
    // Account interface
    public void deposit(double amount) {
        accountBalance = accountBalance + amount;
    }

    public void withdrawl(double amount) {
        if (amount < this.getAccountBalance()) {
            this.setAccountBalance(this.getAccountBalance() - amount);
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
                + "\n Accoutn Balance: \t" + accountBalance;
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

    public void setAccountBalance(double accountBalance) {
        if (accountBalance > 0) {
            this.accountBalance = accountBalance;
        } else {
            System.out.println("Error. Balance cannot be a negative number.");
        }
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
}
