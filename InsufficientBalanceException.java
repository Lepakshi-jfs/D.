package day_5_java;

public class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException() {
		super("Insufficient Balance to withdraw ");
		
	}

}
