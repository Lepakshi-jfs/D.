package day_5_java;
public class ArithmeticApplnParameters {
	public ArithmeticApplnParameters() {
		
	}
	public static void main(String[] args) {
		ArithmeticParameters arithmeticParameters =(x,y)->{ 
			//lambda expression			
			System.out.println("This is add method");
						return x+y;
		};
		
		System.out.println(arithmeticParameters.add(2,3));
		
		arithmeticParameters.output();
	}	
		
	}


