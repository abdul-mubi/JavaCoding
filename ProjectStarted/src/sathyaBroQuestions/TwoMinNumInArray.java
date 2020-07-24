package sathyaBroQuestions;

public class TwoMinNumInArray {

	public static void main(String[] args) {

		int[] num = {43,3,6756,-1,878,32};
		int smallest = num[0];
		int secondSmallest = num[1];
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]<smallest) {
				secondSmallest = smallest;
				smallest = num[i];
			}
			
			if(num[i]>smallest && num[i]<secondSmallest) {
				secondSmallest = num[i];
			}
		}
		
		System.out.println("Smallest number is "+smallest);
		System.out.println("Second Smallest number is "+secondSmallest);
		
		
	}

}
