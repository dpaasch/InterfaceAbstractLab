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

    private Account account;

    // Get an account object.  
    public AccountManager(Account account) {
        this.account = account;
    }

    // Accessors & mutators:
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        account.getAccountID();
        this.account = account;
    }

    public String toString() {
        return this.account.toString();
    }
}
