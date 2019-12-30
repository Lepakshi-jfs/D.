package day_5_java;

public class Employee {
private int empId;
private String empName;
private double salary;

public Employee() {
	super();
}

public Employee(int empid, String empname, double salary) {
	super();
	this.empId = empid;
	this.empName = empname;
	this.salary = salary;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

}
