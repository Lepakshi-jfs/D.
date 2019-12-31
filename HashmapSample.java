package day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapSample {

	public static void main(String[] args) {
		HashMap<String,Integer> phoneBook =new HashMap<>();
		phoneBook.put("Pranavi", 12345);
		phoneBook.put("Ryakala",3456);
		System.out.println(phoneBook);
		phoneBook.put("Pranavi", 12345);
		phoneBook.put("Pranavi", 865);
		System.out.println(phoneBook);
		System.out.println(phoneBook.get("Pranavi"));
		Set set=phoneBook.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
