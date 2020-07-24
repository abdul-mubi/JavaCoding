package sathyaBroQuestions;

import java.util.Arrays;

public class RemoveDuplicateInArray {
	
	//index method
	public static int indexMethod(String[] name) {
		
		int j = 0;

		for (int i = 1; i < name.length; i++) {

			if (name[i - 1] != name[i]) {
                name[j++]=name[i-1]; 
				
			}
		}

		name[j++] = name[name.length - 1];
		
		return j;
	}

	//temp array method
	public static int tempArray(String[] name) {

		String[] names = new String[name.length];

		int j = 0;

		for (int i = 1; i < name.length; i++) {

			if (name[i - 1] != name[i]) {

				names[j] = name[i - 1];
				j++;
			}
		}

		names[j] = name[name.length - 1];

		for (int i = 0; i <= j; i++) {

			name[i] = names[i];
		}
		
		return j;
		
	}

	public static void main(String[] args) {

		String[] name = { "Java", "Selenium", "Qtp", "Maven", "Qtp" };

		Arrays.sort(name);

		System.out.println(Arrays.toString(name));

		int length = indexMethod(name);		
		
		for(int i=0; i<length; i++) {
			
			System.out.println(name[i]);
		}

	}

}
