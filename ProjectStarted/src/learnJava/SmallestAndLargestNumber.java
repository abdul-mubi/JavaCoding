package learnJava;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int[] num = {32,-78,299,-938,373829};
		
		int largest = num[0];
		int smallest = num[0];
		
		
		for(int j=1; j<num.length; j++) {
			
			if(num[j]<smallest) {
				
				smallest = num[j];
			}else if(num[j]>largest) {
				
				largest = num[j];
			}
			
		}
		
		System.out.println("Given array values are :::" + Arrays.toString(num));
		System.out.println("Largest value is "+largest);
		System.out.println("Smallest value is "+smallest);
		
		

	}

}
