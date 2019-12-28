package Pranavi;

public class Student  {
protected int regno;
protected String stdname;
protected String group;
public void display()
{
System.out.println(regno+ " "+stdname+" "+group);	
}
public void newMethod(){
	System.out.println("Super class");
}
public void display1(){
	System.out.println("super class");
}

public Student(int regno, String stdname, String group) {
	super();
	this.regno = regno;
	this.stdname = stdname;
	this.group = group;
}
public Student() {
	// TODO Auto-generated constructor stub
}

}

