package Pranavi;

public class PatternPrintingAss1{

	public static void main(String[] args) {
		String str=args[0];
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		
		int l=sb.length();
		for(int i=0;i<l;i++)
			System.out.println(sb.charAt(i));
		System.out.println();
		for(int i=0;i<l;i++)
		{
		for(int j=0;j<=i;j++)
			System.out.print(sb.charAt(j));
System.out.println();
		}
	}

}
