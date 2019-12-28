package Pranavi;

public class ClassOneApplication extends ClassOne {

	public ClassOneApplication(){
		
	}
	
	public ClassOneApplication(int x, int y) {
		super(x, y);
		
	}

	public static void main(String[] args) {
	//we can execute only methods present in classOne	
		ClassOne app= new ClassOneApplication(2,3);
		app.display();
		app.output();
		//app.qwe();
//we can execute methods present in both classOne and classOneApplication
		ClassOneApplication app1= new ClassOneApplication(21,31);
		app1.display();
		app1.output();
		app1.qwe();
		
		
	}

	@Override
	void output() {
		System.out.println("abstract method implementation");
		System.out.println(x+y);
	}
	void qwe(){
		System.out.println("hgfx");
	}

}
