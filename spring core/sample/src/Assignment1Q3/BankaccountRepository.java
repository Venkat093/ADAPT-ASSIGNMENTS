package Assignment1Q3;

public interface BankaccountRepository {
	
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}
