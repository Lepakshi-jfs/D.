
package day_5_java;

public class Aeroplane implements Vechile {

	public Aeroplane() {
		
	}

	public static void main(String[] args) {
		Aeroplane aeroplane=new Aeroplane();
		aeroplane.wheels();
		aeroplane.engines();
	}

	@Override
	public void wheels() {
		System.out.println("3");
		
	}

	@Override
	public void engines() {
		System.out.println("2");
		
	}

}
