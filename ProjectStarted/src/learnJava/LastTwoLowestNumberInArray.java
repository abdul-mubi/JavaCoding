package learnJava;

public class LastTwoLowestNumberInArray {

	public static void main(String[] args) {

		int[] array= {32,-1,5,235,56,44,7,4};
		
		int smallest = array[0];
		int secondSmallest = array[1];
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]<smallest) {
				
				secondSmallest = smallest;
				smallest = array[i];
			}
			
			if(array[i]>smallest && array[i]< secondSmallest) {
				
				secondSmallest = array[i];
			}
		}
		
		System.out.println("Smallest - "+smallest);
		System.out.println("Second Smallest - "+secondSmallest);
				
	}

}
