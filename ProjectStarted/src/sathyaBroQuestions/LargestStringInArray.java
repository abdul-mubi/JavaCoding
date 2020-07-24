package sathyaBroQuestions;

public class LargestStringInArray {

	public static void main(String[] args) {

		String string = "Selenium is one of the Automation Tool in the Market";
		String[] array=string.split(" ");
		int size = array[0].length();
		String largest = null;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i].length()>size) {// for smallest number just change the > operator to <
				size = array[i].length();
				largest = array[i];
			}
		}
		
		System.out.println("Largest String in the give String is "+largest);
		
		
	}

}
