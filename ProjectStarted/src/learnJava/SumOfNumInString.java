package learnJava;

public class SumOfNumInString {

	public static void main(String[] args) {

		String string = "fa20f5wf5uui80n300";
		String num = "";
		int sum = 0;

		for (int i = 0; i < string.length(); i++) {

			if (Character.isDigit(string.charAt(i))) {

				num = num + string.charAt(i);
			} else if (Character.isLetter(string.charAt(i)) && num.length() > 0) {

				sum = sum + Integer.parseInt(num);
			    num = "";
			}
			
		}
		
		if(Character.isDigit(string.charAt(string.length()-1))) {
		sum = sum + Integer.parseInt(num);
		}
		
		System.out.println("Sum of numbers present in the string is " + sum);
	}

}
