package Pranavi;

public class StudentResult {
public static void main(String[] args) {
	int regno=100;
	int sub1=45;
	int sub2=56;
	int sub3=67;
	int total=sub1+sub2+sub3;
	double average=total/3;
	if(sub1>=40 && sub2>=40 && sub3>=40)
		System.out.println("pass");
	else 
		System.out.println("fail");
	
}
}
