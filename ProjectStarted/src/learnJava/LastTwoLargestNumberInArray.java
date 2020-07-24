package learnJava;

public class LastTwoLargestNumberInArray {

	public static void main(String[] args) {

		int[] array = {23,21,31,2,5634,1329,1,1000};
		
		int largest = array[0];
		int secondLargest = array[1];
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]>largest) {
				
				secondLargest = largest;
				largest = array[i];
			}
			
			if (array[i]<largest && array[i]>secondLargest) {
				
				secondLargest = array[i];
			}
		}
		
		System.out.println("Largest - "+largest);
		System.out.println("Second Largest - "+secondLargest);
	}

}
