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
public class BankAccount extends AccountManager implements Account {

    // BankAccount properties: These properties will be shared with the savings 
    // account class and will only be declared within this super class.
    private int accountID;                  // account number
    private String lastName;                // account owner last name  
    private String firstName;               // account owner first name
    private double accountBalance;          // acount balance
    private static double interestRate;     // interest rate

    // Constructor calls the abstract superclass constructor.
    public BankAccount(int accountID, String lastName, String firstName,
            double accountBalance, Account account) {
        super(account);
        this.accountID = accountID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.accountBalance = accountBalance;
    }

    // Accessor & Mutator Methods: These include the 3 methods found in the 
    // Account interface
    // Setting the deposit and withdrawl methods to final, so they cannot be
    // overridden within the SavingsAccount sub-class.
    public final void deposit(double amount) {
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

    // Setting this method as final, so it cannot be overridden within the 
    // SavingsAccount sub-class.
    public final void setAccountBalance(double accountBalance) {
        if (accountBalance > 0) {
            this.accountBalance = accountBalance;
        } else {
            System.out.println("Error. Balance cannot be a negative number.");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
}
