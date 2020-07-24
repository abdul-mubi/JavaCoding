package sathyaBroQuestions;

public class UpperCaseAndLowerCaseInString {

	public static void lowerCase(String string) {

		int lowerCount = 0;

		for (int i = 0; i < string.length(); i++) {

			if (Character.isLowerCase(string.charAt(i))) {
				++lowerCount;
				System.out.println("Lowercase characters are " + string.charAt(i));
			}
		}
		System.out.println("Total characters are " + lowerCount);

	}

	public static void upperCase(String string) {

		int upperCount = 0;

		for (int i = 0; i < string.length(); i++) {

			if (Character.isUpperCase(string.charAt(i))) {
				++upperCount;
				System.out.println("Uppercase characters are " + string.charAt(i));
			}
		}
		System.out.println("Total characters are " + upperCount);

	}

	public static void main(String[] args) {

		String string = "Selenium is one of the Automation Tool in the Market";

		upperCase(string);
		lowerCase(string);
        
	}

}
