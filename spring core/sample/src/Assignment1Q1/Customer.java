package Assignment1Q1;
public class Customer {
	private int customerId;
	private String customerName; 
	private String customerContact;
	private String CustomerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public void print()
	{
		System.out.println("Customer details [ customername  :"+getCustomerName() +"  Costomercontact  : "+getCustomerContact() +"customer Adress :"  );
		}

}
