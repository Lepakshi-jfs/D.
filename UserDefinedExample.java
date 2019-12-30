package day_5_java;

public class UserDefinedExample {

	public static void main(String[] args) {
		int empcode=122;
		int code=Integer.parseInt(args[0]);
		try{
			if(empcode!=code)
				throw new EmployeeNotFoundException();
			System.out.println("Employee Exist");
		}
		catch(EmployeeNotFoundException e){
			System.out.println(e.getMessage());
			
		}
	}

}
