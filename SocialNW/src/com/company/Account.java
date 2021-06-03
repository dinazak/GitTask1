
package problem3;

/**
 *
 * @ Dina Zakaria Mostafa (20190197)
 */
public class Account
{

    private double balance;
    private int accountNumber;

    /**
     *
     */
    public Account() {};

    /**
     *
     * @param balance represents the initial balance of the bank account
     * @param accountNumber represents the account number of the  bank account
     */
    public Account(double balance, int accountNumber)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return the current balance of the bank account
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     *
     * @param balance represents the balance of the bank account
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    /**
     *
     * @return the account number of the account
     */
    public int getAccountNumber()
    {
        return accountNumber;
    }

    /**
     *
     * @param AccountNumber the account number of the bank account
     */
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return information about the bank account
     */
    public String toString()
    {
        return "Account number is: "+ accountNumber+" balance is: "+balance ;
    }

    /**
     *
     * @param t represents amount of money you want to withdraw
     *
     */
    public void WithDraw(double t)
    {
        if(balance!=0|| balance-t>=0)
        {
            balance=balance-t;
            System.out.println("The process is finished successfully" +System.lineSeparator()+"Your balance is: "+balance);

        }
        else
        {
            System.out.println("your bank balance is insufficient"+System.lineSeparator()+"Your balance is: "+balance);
        }

    }

    /**
     *
     * @param p represents the amount of money you want to deposit
     *
     */
    public void deposit(double p)
    {
        balance=balance+p;
        System.out.println("The process is finished successfully" +System.lineSeparator()+"Your balance is: "+balance);
    }
}
