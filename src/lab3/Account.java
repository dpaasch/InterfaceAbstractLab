package lab3;

/**
 * Which super classes should be concrete vs. abstract vs. Interface?  Justify 
 * your choices by adding comments to each class.
 * This super class contains actions that may be essential to different types of
 * accounts, but may not be as essential to every type of account, such as
 * a customer account. This Account interface is going to provide behaviors that 
 * the sub-classes will be implementing.
 * 
 * @author Dawn Bykowski
 */
public interface Account {
    
   public void withdrawl(double amount);
   public void deposit(double amount);
   public int getAccountID();
    
}
