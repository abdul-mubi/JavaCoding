package learnJava;

public class FactorialNumber {
	
	public static int factorialNum(int num) {
		
		//int result=0;
		
		int div = 1;
		
		for(int i = 1 ; i<=num; i++) {
			
			div = div * i;
		}
		return div;
		
	}
	

	public static void main(String[] args) {

		System.out.println("Factorial of given value is "+factorialNum(5));
	}

}
