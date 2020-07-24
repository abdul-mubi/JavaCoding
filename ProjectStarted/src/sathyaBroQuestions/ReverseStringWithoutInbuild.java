package sathyaBroQuestions;

public class ReverseStringWithoutInbuild {

	public static void main(String[] args) {

		String palindrome = "Selenium";
		
		String rev ="";
		
		for(int i=palindrome.length()-1;i>=0;i--) {
			
			rev = rev + palindrome.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
