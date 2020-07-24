package learnJava;

public class StringHasDigits {

	public static void main(String[] args) {

		String a = "null";
		
		if (a==null || a.length()==0) {
			
			System.out.println("false");
		}
		
		//in this scenario even after finding a==null, remaining lines will be executed 
		//so just to avoid that we need to create in a seperate method and call them
		String ab = a.replaceAll("[^0-9]", "");
		
		if(ab==a) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
	}

}
