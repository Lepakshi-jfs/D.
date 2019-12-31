package day5;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Hello world");
		while(st.hasMoreTokens())
System.out.println(st.nextToken());
		StringTokenizer st1=new StringTokenizer("Hello : :world :welcome",":", true);
		while(st1.hasMoreTokens())
System.out.println(st1.nextToken());
	}

}
