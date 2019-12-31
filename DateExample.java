package day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		Date dt=new Date();
		String dob="29-06-1997";
		String dob1="29-jun-1997";
		System.out.println(dt);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		dt=sdf.parse(dob);
		System.out.println(dt);
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-yyyy");
		dt=sdf1.parse(dob1);
		System.out.println(dt);

	}

}
