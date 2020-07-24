package sathyaBroQuestions;

public class LargestAndSmallestNumInArray {

	public static void main(String[] args) {

		int[] num= {42324,23,434,44,44,-434,-41434,-423};
		
		int largest = num[0];
		int smallest = num[1];
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]>largest) {
				largest = num[i];
			}
			
			if(num[i]<smallest) {
				smallest = num[i];
			}
		}
		
		System.out.println("Largest number is "+largest+ " and smallest number is "+smallest);
	}

}
