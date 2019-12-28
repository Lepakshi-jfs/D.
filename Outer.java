package Pranavi;

public class Outer {
int x;
void display(){
	x=20;
	System.out.println(x);
}
class  Inner{
	int y;
	void output(){
		y=20;
		System.out.println(y);
	}
}
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.display();
		Outer.Inner inner=outer.new Inner();
		inner.output();
		
	}

}
