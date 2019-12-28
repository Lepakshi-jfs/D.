package Pranavi;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();//thread safe,synchronous
		sb1.append("Pranavi");
		System.out.println(sb1);
		System.out.println(sb1.length());
		StringBuilder sb2=new StringBuilder();//asynchronous,not safe during multi threading operations
		sb2.append("Ryakala");
		String str=sb2.toString();
		System.out.println(str);
		System.out.println(sb2);
		System.out.println(sb1.charAt(0));
		System.out.println(sb1.delete(0, 7));
		System.out.println(sb2.charAt(1));
		System.out.println(sb2.delete(0, 7));
		
		
	}

}
