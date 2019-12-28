package Pranavi;

public class TypeCasting {

	public static void main(String[] args) {
		byte b = 9;
		short s1=b;//implicit casting
		int i =987;
		short s2= (short) i;//explicit casting
		String s3="12";
		int i2=Integer.parseInt(s3);
		
		System.out.println(b +" "+s1+" "+i+" "+ s2+" "+s3+" "+i2);
	}

}
