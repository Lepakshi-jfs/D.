package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D://Pranavi/Alphabets");
			FileOutputStream fos = new FileOutputStream("D://Pranavi//FileCopy");
			int x;
			while((x=fis.read())!=-1)
						fos.write((char)x);
			System.out.println("success");
			fos.close();
			fis.close();
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
