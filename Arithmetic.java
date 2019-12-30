package day_5_java;

public interface Arithmetic {
void add();
//functional interface
default void output(){
	System.out.println("This is default method, these can be of n n.o");}
	default void check(){
		System.out.println("default 2");
	}
}

