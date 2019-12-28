package Pranavi;

public class ConstructorApp {

	public static void main(String[] args) {
		Constructor constructor1=new Constructor();
		Constructor constructor2=new Constructor(12,"234","wert");
		Constructor constructor3=new Constructor(12,"qwe");
		
		System.out.println(constructor1.getCustomerId());
		System.out.println(constructor1.getCustomerName());
		System.out.println(constructor1.getCity());
		System.out.println(constructor2.getCustomerId());
		System.out.println(constructor2.getCustomerName());
		System.out.println(constructor2.getCity());
		System.out.println(constructor3.getCustomerId());
		System.out.println(constructor3.getCustomerName());
		System.out.println(constructor3.getCity());


	}

	
}
