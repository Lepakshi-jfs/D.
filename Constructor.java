package Pranavi;

public class Constructor {
	//private static final String invalidName = "Enter Correct Name";
	private int customerId;
	private String customerName;
	private String city;
	public Constructor(){
		
	}
	
	public Constructor(int customerId, String customerName, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
	}
	

	public Constructor(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
