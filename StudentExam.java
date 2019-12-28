package Pranavi;

public class StudentExam extends LibraryDetails {
	
public StudentExam(int regno, String stdname, String group,int sub1,int sub2,int booksIssued) {
		super(regno, stdname, group, booksIssued);
		this.sub1=sub1;
		this.sub2=sub2;
	}

private int sub1;
private int sub2;
	
public void output(){
	int total=sub1+sub2;
	System.out.println(regno+ " "+stdname+" "+group+" "+total+" "+booksIssued);
}
@Override
public void display1(){
	System.out.println("sub class");
}

	public static void main(String[] args) {
		Student student=new Student();
		StudentExam exam1 = new StudentExam(313,"Pranavi","ECE",99,99,5);
		exam1.display1();
		//exam1.output();
		//student.newMethod();
		student.display1();
		//student=exam1;
		//student.display1();
	}

}
