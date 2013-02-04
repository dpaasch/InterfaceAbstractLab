package lab3;

/**
 * Which super classes should be concrete vs. abstract vs. Interface? Justify
 * your choices by adding comments to each class. This sub class will remain
 * a concrete class that inherits from its super classes.
 *
 * @author Dawn Bykowski
 */
public class SavingsAccount extends BankAccount {

    // SavingsAccount properties - local to this class only
    private double minimumBalance = 100.00;

    // Constructor:
    public SavingsAccount(int accountID, String lastName,
            String firstName, double accountBalance) {
        super(accountID, lastName, firstName, accountBalance);
    }

    // calcInterest() method sets the interest rate for the account
    public void calcInterest() {
        if (minimumBalance < 100.00) {
            System.out.println("You have earned no interest.");
        } else {
           setAccountBalance (getAccountBalance() * .05);
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n  Savings Interest Earned" + this.getAccountBalance()
                + "\n  Savings Minimum Balance " + minimumBalance;
    }
}
