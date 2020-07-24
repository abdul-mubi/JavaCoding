package sathyaBroQuestions;

import java.util.Arrays;

public class SortNamesInString {

	public static void main(String[] args) {

		String name ="My name iab iac Abdul";
		name = name.toLowerCase();
		
		String[] arr = name.split(" ");
		String temp="";
		int k=0;
		
		for(int i = 0; i<arr.length;i++) {
			for(int j=1; j<arr.length-i; j++) {
				
				if(arr[j-1].charAt(k) > arr[j].charAt(k)) {
					
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}else if (arr[j-1].charAt(k) == arr[j].charAt(k)) {
					
					boolean flag = true;
					while(flag) {
						try {
							k++;
							if(arr[j-1].charAt(k) > arr[j].charAt(k)) {
								temp = arr[j-1];
								arr[j-1]=arr[j];
								arr[j]=temp;
								
								k=0;
								flag = false;
							}
						} catch (StringIndexOutOfBoundsException e) {
							
							k=0;
							flag = false;
						}	
					}
				}
					
			}
		}
		
		System.out.println(Arrays.toString(arr));
		String sortedString="";
		
		for(int i =0; i<arr.length;i++) {
			
			sortedString = sortedString+" "+ arr[i];
			
		}
		System.out.println(sortedString);
		
		
		
	}

}
