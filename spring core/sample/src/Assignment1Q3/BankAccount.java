package Assignment1Q3;


public class BankAccount implements BankaccountRepository{
	private int  accountId;
	private String accountHoldername;
	private String accountType;
	private String accountBalancee;
	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return ;
	}
	@Override
	public double updateBalance(long accountId, double newBalence) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountBalancee() {
		return accountBalancee;
	}
	public void setAccountBalancee(String accountBalancee) {
		this.accountBalancee = accountBalancee;
	}
	

}
