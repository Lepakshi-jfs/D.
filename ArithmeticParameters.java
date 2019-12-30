package day_5_java;

public interface ArithmeticParameters {
	int add(int x, int y);
	
	default void output(){
		System.out.println("This is default method, these can be of n n.o");}
}
