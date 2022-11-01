package ford.coding;

public class Address {
	
	Integer doNo;
	String street;
	String city;
	public Address() {
		super();
	}
	public Address(Integer doNo, String street, String city) {
		super();
		this.doNo = doNo;
		this.street = street;
		this.city = city;
	}
	public Integer getDoNo() {
		return doNo;
	}
	public void setDoNo(Integer doNo) {
		this.doNo = doNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [doNo=" + doNo + ", street=" + street + ", city=" + city + "]";
	}

}
