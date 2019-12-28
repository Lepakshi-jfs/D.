package Pranavi;

public class UsingStatic {
	 static int x=20;
	
	void display(){
		
		System.out.println(x);
	}
	static int y;
	static void display1(){
		y=2;
		System.out.println(y);
	}
	public static void main(String[] args) {
		x++;
		System.out.println(x);
	//	display(); this can't be done

display1();
	}

}
