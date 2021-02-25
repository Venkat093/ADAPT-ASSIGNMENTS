package Assignment1Q6;

public class Customer {
	private String usernam;
	private String Password;
	private String email;
	private String contact;
	private String zipcode;
	private String city;
	public Customer(String usernam, String password, String email, String contact, String zipcode, String city) {
		super();
		this.usernam = usernam;
		Password = password;
		this.email = email;
		this.contact = contact;
		this.zipcode = zipcode;
		this.city = city;
	}
	public String getUsernam() {
		return usernam;
	}
	public void setUsernam(String usernam) {
		this.usernam = usernam;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
 
}
