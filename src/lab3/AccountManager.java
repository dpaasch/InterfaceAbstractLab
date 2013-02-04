package lab3;

public abstract class AccountManager {

    private Account account;

    // Get an account object.  The account
    public AccountManager(Account account) {
        this.account = account;
    }

    public Account getAccount(int id) {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
