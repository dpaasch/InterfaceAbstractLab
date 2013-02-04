package lab3;

/**
 * Which super classes should be concrete vs. abstract vs. Interface? Justify
 * your choices by adding comments to each class. This super class has a
 * dependency to an abstraction only, thus making it able to be defined as an
 * abstract class. The reason for this declaration is because it is not
 * implementing any of the behaviors found within the interface.
 *
 * @author Dawn Bykowski
 */
public abstract class AccountManager {

    // AccountManager properties: These properties will be shared with the 
    // BankAccount and SavingsAccount classes.  Therefore, these properties will
    // be defined here only.
    private int accountID;                  // account number
    private String lastName;                // account owner last name  
    private String firstName;               // account owner first name
    
    // Constructor: Accepts accountID, lastName, firstName which is common to 
    // any type of account
    public AccountManager(int accountID, String lastName, String firstName) {
        this.accountID = accountID;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    // Method: toString() shows the state of the object
    @Override
    public String toString() {
        String accountManagerString = "\n\n\n"
                + "**********ACCOUNT INFORMATION**********"
                + "\nAccount ID: " + accountID
                + "\nAccount Last Name: " + lastName
                + "\nAccount First Name: " + firstName;
        return accountManagerString;      
    }
}
