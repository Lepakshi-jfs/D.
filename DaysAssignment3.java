package Pranavi;

public class DaysAssignment3 {

	public static void main(String[] args) {
		String str=args[0];
		switch(str)
		{
		case "jan" :
		case "mar":
		case "may":
		case "jul":
		case "aug":
		case "oct":
		case "dec":
			System.out.println("31");break;
		case "feb": 
			System.out.println("28 or 29");break;
		case "apl" :
		case "jun":
		case "sep":
		case "nov":
			System.out.println("30");break;
			default: System.out.println("enter a valid month");
		}
	
		
	}
}
