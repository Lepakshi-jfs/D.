package day5;

import java.io.File;
import java.io.FileOutputStream;

public class FileWriting {

	public static void main(String[] args) {
		File file=new File("D://Pranavi");
		file.mkdir();
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("D://Pranavi//Alphabets");
			for(int i=65;i<91;i++)				
				fos.write(i);	
//			//for(CharSequence i='A';i<'Z';i++)				
//				((Appendable) fos).append((char) 2);	
			fos.close();
			System.out.println("success");
	 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
