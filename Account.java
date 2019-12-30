package day_5_java;

public class Account {
private int accNo;
private String customerName;
protected Double balance;
public Account() {
	super();
}
public Account(int accNo, String customerName, double balance) {
	super();
	this.accNo = accNo;
	this.customerName = customerName;
	this.balance = balance;
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}


}
