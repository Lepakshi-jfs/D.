package day_5_java;

public class InterfaceAppln implements One, Three{

	public InterfaceAppln() {
		
	}

	public static void main(String[] args) {
	InterfaceAppln one=new InterfaceAppln();
one.method1();
one.method2();
one.method3();
	
	}
	@Override
	public void method2() {
		System.out.println("method 2");
		
	}

	@Override
	public void method3() {
		System.out.println("method 3");
		
		
	}

	@Override
	public void method1() {
		System.out.println("method 1");
	}
	}


