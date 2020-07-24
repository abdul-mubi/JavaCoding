package learnJava;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
	 int input = 17;
	 
	 for(int i=2; i<=input; i++) {
		 
		 if(primeNumbers(i)) {
			 
			 System.out.println("Prime Numbers are "+i);
		 }
		 
	 }
		
		
		
	}
	
	public static boolean primeNumbers(int num) {
		
        int y;
		
		int count = 0;
		
		for(int i = num; i>1 ; i--) {
			
			y = num % i;
			
			
			if(y == 0) {
				
				++count;
			}
			
		}
		
		if(count==1) {
			
			return true;
		}else {
			
			return false;
		}
	}
}
