package sathyaBroQuestions;

public class VowelsInString {

	public static void main(String[] args) {

		String name = "My name is Abdul and i am working in Accenture";
		
		name = name.replaceAll("[^aeiouAEIOU]", "");
		
		System.out.println("Number of vowels present in given string is "+name.length());
		
	}

}
