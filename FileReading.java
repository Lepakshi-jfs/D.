package day5;

import java.io.FileInputStream;

public class FileReading {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D://Pranavi/Alphabets");
			int x;
			while((x=fis.read())!=-1)
				System.out.println((char)x);
			fis.close();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		

	}

}
