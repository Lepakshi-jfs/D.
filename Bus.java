package day_5_java;

public class Bus implements Vechile {

	public Bus() {
	
	}

	public static void main(String[] args) {
		Bus bus=new Bus();
		bus.wheels();
		bus.engines();
	}

	@Override
	public void wheels() {
		System.out.println("6");
		
	}

	@Override
	public void engines() {
		System.out.println("1");
		
	}

}
