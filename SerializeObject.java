package day5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObject {

	public static void main(String[] args) {
		FileOutputStream fos;
		try{
		fos=new FileOutputStream("D://Pranavi/Customer");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Customer customer1=new Customer(111,"pranavi",123);
		Customer customer2=new Customer(112,"Ryakala",1231);
		Customer customer3=new Customer(113,"Prathibha",12312);
		System.out.println(customer1 +" "+customer2+ " "+customer3);
		oos.close();
		fos.close();
		System.out.println("success");
	}catch(IOException e)
		{
		e.printStackTrace();
		}

	}
}
