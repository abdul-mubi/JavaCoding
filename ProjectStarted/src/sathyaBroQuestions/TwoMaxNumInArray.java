package sathyaBroQuestions;

public class TwoMaxNumInArray {

	public static void main(String[] args) {

		int[] num = {8768,545,3423,67,2,64,312,67};
		int largest = 0;
		int secondLargest = 0;
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]>largest) {
				secondLargest = largest;
				largest = num[i];	
			}
			
			if(num[i]<largest && num[i]>secondLargest) {
				secondLargest = num[i];
			}
			
			
		}
		
		System.out.println("Largest number is "+largest);
		System.out.println("Second Largest number is "+ secondLargest);
		
	}

}
