package Pranavi;

public class LibraryDetails extends Student {

	public LibraryDetails(int regno, String stdname, String group,int booksIssued) {
		super(regno, stdname, group);
		this.booksIssued=booksIssued;
		
	}
protected int booksIssued;
public void issue()
{
	System.out.println(regno+ " "+stdname+" "+group+" "+" "+booksIssued);
}
public static void main(String[] args) {
	LibraryDetails exam = new LibraryDetails(313,"Pranavi","ECE",5);
	exam.display();
exam.issue();
	}
}

