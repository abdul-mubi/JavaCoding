package sathyaBroQuestions;

public class SwapWithoutTemp {

	public static void main(String[] args) {

		//Integers
		int a= 10;
		int b= 4232;
		
		a = a+b;
		
		b = a - b;
		
		a = a - b;
		
		System.out.println("Value of A is "+a+" and Valus of B is "+b);
		
		//String
		String a1 = "Abdul";
		String b1 = "Selenium";
		
		a1 = a1.concat(b1);
		
		b1 = a1.substring(0,(a1.length()-b1.length()));
		
		a1 = a1.substring(b1.length());
		
		System.out.println("Value of A1 is "+a1+" and Value of B1 is "+b1);
		
	}

}
