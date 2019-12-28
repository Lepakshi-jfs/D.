package Pranavi;

public class PalindromeAssignment {

	public static void main(String[] args) {
		String str=args[0];
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		System.out.println(sb);
		sb.reverse();
		String str1=sb.toString();
		
		System.out.println(sb);
		if(str.equals(str1))
			System.out.println("is palindrome");
		else
			System.out.println("is not palindrome");
		
	}

}
