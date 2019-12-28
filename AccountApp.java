package Pranavi;

public class AccountApp {

	public static void main(String[] args) {
		Account account=new Account();
		account.setAccountNumber(12);
		account.setCustomerName("Pranavi");
		account.setBalance(123.23);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getCustomerName());
		System.out.println(account.getBalance());
		

	}

}
