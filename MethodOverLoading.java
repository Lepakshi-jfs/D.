package Pranavi;

public class MethodOverLoading {
void add(int x,int y){
System.out.println("int: "+(x+y));
}
void add(double x,double y){
System.out.println("double: "+(x+y));}
void add(String x,String y){
System.out.println("string: "+(x+y));}
	public static void main(String[] args) {
		MethodOverLoading method=new MethodOverLoading();
		method.add(1, 2);
		method.add(12, 123.2);
		method.add("Pranavi", " Ryakala");

	}

}
