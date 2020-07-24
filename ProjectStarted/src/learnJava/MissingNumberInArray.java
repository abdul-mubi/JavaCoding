package learnJava;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		
		int[] a = {75,77,78,79,80};
		
		int size = a.length;
		
		int sum = 0;
		
		for(int i=0; i< size; i++) {
			
			sum = sum +a[i];
		}
		
		System.out.println("Sum of numbers present in array - "+ sum);
		
		int sum1 = 0;

		for (int j = 75; j <= 80; j++) {

			sum1 = sum1 + j;
		}		
		
		System.out.println("Sum of numbers including missing values - "+ sum1);
		
        int missing_number = sum1-sum;
        
        System.out.println("Missing number - "+ missing_number);
	}

}
