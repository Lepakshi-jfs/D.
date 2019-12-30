package day_5_java;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int empId=sc.nextInt();
	 String empName=sc.nextLine();
	 double salary=sc.nextDouble();
	ArrayList<Employee> emplist=new ArrayList<>();
	emplist.add(new Employee(empId,empName,salary));
	emplist.add(new Employee(empId,empName,salary));
	for(Employee emp:emplist)
	System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getSalary());	
}

}
