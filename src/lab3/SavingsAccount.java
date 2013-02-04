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
            String firstName, double accountBalance, Account account) {
        super(accountID, lastName, firstName, accountBalance, account);
    }

    // payInterest() method sets the interest rate for the account
    public void payInterest() {
        double newBalance =
                this.getAccountBalance() * (1 + (this.getInterestRate() / 100));
        if (this.getAccountBalance() >= this.minimumBalance) {
            this.setAccountBalance(newBalance);
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n  Savings Interest Rate " + this.getInterestRate()
                + "\n  Savings Minimum balance " + this.minimumBalance;
    }
}
