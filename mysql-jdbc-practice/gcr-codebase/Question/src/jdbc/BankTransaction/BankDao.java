package jdbc.BankTransaction;

public interface BankDao {
    public void addAccount(Account a);
    public Account getAccount(int accountNo);
    public void addAmount(int accountNo,double amount);
    public void withdrawal(int accountNo,double amount);
    public void transferAmount(int sender,int reciver,double amount);
    
}
