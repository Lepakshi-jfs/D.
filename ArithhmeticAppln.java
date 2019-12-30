package day_5_java;

public class ArithhmeticAppln {

	public ArithhmeticAppln() {
		
	}
	public static void main(String[] args) {
		Arithmetic arithmetic=()->{          //lambda expression
			System.out.println("This is add method");
		};
		arithmetic.add();
		arithmetic.output();
		arithmetic.check();
	}

}
