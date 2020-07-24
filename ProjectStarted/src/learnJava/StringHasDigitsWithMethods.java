package learnJava;

public class StringHasDigitsWithMethods {

	public static boolean isEmpty(String a) {

		if (a == null || a.length() == 0) {

			return false;
		}
		
		return true;
   }
	
	public static boolean isNumber(String a) {
		
		if(isEmpty(a)) {
		
		String ab = a.replaceAll("[^0-9]", "");

		if (ab == a) {
			return true;
		} else {
			return false;
		}
		}
		
		return false;
		
	}

	public static void main(String[] args) {

		String string =null;
		
		System.out.println(isNumber(string));

	}

}
