package demoo;

public class demo {
	
	private String State;
	private String City;
	private String Country;
	private int Zipcode;
	public demo(String state, String city, String country, int zipcode) {
		super();
		State = state;
		City = city;
		Country = country;
		Zipcode = zipcode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getZipcode() {
		return Zipcode;
	}
	public void setZipcode(int zipcode) {
		Zipcode = zipcode;
	}
	
	
	
	
	
	

}
