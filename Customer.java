package Pranavi;
/** documentation comments */
public class Customer {
private static final String invalidName = "Enter Correct Name";
private int customerId;
private String customerName;
private String city;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	
	this.customerId = customerId;
}
public String getCustomerName() {
	if(customerName.length()<10)
	return customerName;
	else 
		return invalidName;
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
