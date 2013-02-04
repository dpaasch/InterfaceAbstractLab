package lab3;

// calcInterest() method sets the interest rate for the account
/**
 * Which super classes should be concrete vs. abstract vs. Interface? Justify
 * your choices by adding comments to each class. This sub class will remain a
 * concrete class that inherits from its super classes.
 *
 * @author Dawn Bykowski
 */
public class SavingsAccount extends BankAccount {

    // SavingsAccount properties - local to this class only
    private double minimumBalance = 100.00;   // required minimum balance

    // Constructor:
    public SavingsAccount(double minimumBalance, double accountBalance, 
            int accountID, String lastName, String firstName) {
        super(accountBalance, accountID, lastName, firstName);
    }

    @Override
    public String toString() {

        String SavingsAccountString = super.toString()
                + "\n  Account Minimum Balance: " + minimumBalance;
        return SavingsAccountString;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

}
