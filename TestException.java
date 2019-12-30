package day_5_java;

public class TestException {

	public TestException() {
		
	}

	public static void main(String[] args) {
		int x=2;
		int y=0;
		int []arr={1,2,3};
		
		try{
			int z=x/y;
		System.out.println(z);
		}
		catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception");
		}
		try{
			System.out.println(arr[4]);
		}
		catch(IndexOutOfBoundsException ie){
			System.out.println("Array index out of bounds exception");
		}
		
		catch(Exception e){
			System.out.println("Exception");
		}

	}

}
