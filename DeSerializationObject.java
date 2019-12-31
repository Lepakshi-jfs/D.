package day5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationObject {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("D://Pranavi/Customer");
			ois=new ObjectInputStream(fis);
			Object obj;
			while((obj=ois.readObject())!=null){
				Customer cust=(Customer) obj;
				System.out.println(cust.getCustId()+cust.getCustname()+cust.getCommn());
				
			}
		} catch (IOException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		try{
			ois.close();
			fis.close();
			System.out.println("done");
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
